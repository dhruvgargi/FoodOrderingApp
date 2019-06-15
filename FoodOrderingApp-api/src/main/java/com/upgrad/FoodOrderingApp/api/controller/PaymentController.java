package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.requestmodal.PaymentListResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Payment Controller: ",description = "end-points for payment details")
@RequestMapping("/payment")
public class PaymentController {


        @GetMapping("/")
        @ApiOperation(value="Retrieve payment methods for the application")
        public ResponseEntity<PaymentListResponse> getPaymentResponse(){


            return new ResponseEntity<PaymentListResponse>(HttpStatus.OK);
        }
}
