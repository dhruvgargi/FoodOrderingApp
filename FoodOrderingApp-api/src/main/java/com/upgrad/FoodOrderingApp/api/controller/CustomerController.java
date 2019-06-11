package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.requestmodel.*;
import com.upgrad.FoodOrderingApp.service.businness.CustomerService;
import com.upgrad.FoodOrderingApp.service.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    Customer customerModel;

    @Autowired
    CustomerService customerService;

    @PostMapping(path = "/signup",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupCustomerResponse> signUpCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){
        System.out.println("CustomerController>>>>>>"+signupCustomerRequest.toString());
        customerModel.setFirstName(signupCustomerRequest.getFirstName());
        customerModel.setLastName(signupCustomerRequest.getLastName());
        customerModel.setEmailAddress(signupCustomerRequest.getEmailAddress());
        customerModel.setPassword(signupCustomerRequest.getPassword());

        boolean bool = customerService.signupCustomerService(customerModel);

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.CREATED);
    }


    @PostMapping(path="/login",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupCustomerResponse> loginCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.OK);
    }

    @PostMapping(path="/logout",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupCustomerResponse> logoutCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.OK);
    }

    @PutMapping(path="/",consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(@RequestBody UpdateCustomerRequest updateCustomerRequest){
        return new ResponseEntity<UpdateCustomerResponse>(HttpStatus.CREATED);
    }

    @PutMapping(path="/password",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UpdatePasswordResponse> updatePassword(@RequestBody UpdatePasswordRequest updatePasswordRequest){
        return new ResponseEntity<UpdatePasswordResponse>(HttpStatus.CREATED);
    }

}
