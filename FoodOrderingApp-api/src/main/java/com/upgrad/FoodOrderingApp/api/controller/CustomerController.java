package com.upgrad.FoodOrderingApp.api.controller;


import com.upgrad.FoodOrderingApp.api.requestmodal.*;
import com.upgrad.FoodOrderingApp.service.businness.CustomerService;
import com.upgrad.FoodOrderingApp.service.exception.SignUpRestrictedException;
import com.upgrad.FoodOrderingApp.service.model.CustomerModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.UUID;

@RestController
@RequestMapping("/customer")
@Api(value = "CustomerEntity Controller",description = "end-points for CustomerEntity Functions: Signup/Login/Logout/Password")
public class CustomerController {

    @Autowired
    CustomerModel customerModel;

    @Autowired
    CustomerService customerService;

    @PostMapping(path = "/signup",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value="Registration for new customer")
    public ResponseEntity<SignupCustomerResponse> registerCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest)
    throws SignUpRestrictedException {
        customerModel.setFirstName(signupCustomerRequest.getFirstName());
        customerModel.setLastName(signupCustomerRequest.getLastName());
        customerModel.setEmailAddress(signupCustomerRequest.getEmailAddress());
        customerModel.setContactNumber(signupCustomerRequest.getContactNumber());
        customerModel.setPassword(signupCustomerRequest.getPassword());
        customerModel.setuUId(UUID.randomUUID().toString());

        SignupCustomerResponse signupCustomerResponse = new SignupCustomerResponse();
        signupCustomerResponse.setId(customerModel.getuUId());

        customerModel = customerService.registerUser(customerModel);

        signupCustomerResponse.setId(customerModel.getuUId());
        signupCustomerResponse.setStatus("CUSTOMER SUCCESSFULLY REGISTERED");

        return new ResponseEntity<>(signupCustomerResponse,HttpStatus.CREATED);
    }


    @PostMapping(path="/login",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value="Authentication for an existing customer")
    public ResponseEntity<SignupCustomerResponse> loginCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.OK);
    }

    @PostMapping(path="/logout",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value="Sign-out for an already logged-in customer")
    public ResponseEntity<SignupCustomerResponse> logoutCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.OK);
    }

    @PutMapping(path="/",consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value="Update the registered customer information")
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(@RequestBody UpdateCustomerRequest updateCustomerRequest){
        return new ResponseEntity<UpdateCustomerResponse>(HttpStatus.CREATED);
    }

    @PutMapping(path="/password",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value="Update the password for an existing CustomerEntity")
    public ResponseEntity<UpdatePasswordResponse> updatePassword(@RequestBody UpdatePasswordRequest updatePasswordRequest){
        return new ResponseEntity<UpdatePasswordResponse>(HttpStatus.CREATED);
    }

}
