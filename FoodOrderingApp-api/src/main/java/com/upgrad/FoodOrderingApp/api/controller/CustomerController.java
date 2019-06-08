package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.model.SignupCustomerRequest;
import com.upgrad.FoodOrderingApp.api.model.SignupCustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping(path = "/signup",consumes = "MediaType.APPLICATION_JSON_UTF8")
    public ResponseEntity<SignupCustomerResponse> signUpCustomer(@RequestBody SignupCustomerRequest signupCustomerRequest){
        System.out.println("CustomerController>>>>>>"+signupCustomerRequest.toString());

        return new ResponseEntity<SignupCustomerResponse>(HttpStatus.OK);
    }

}
