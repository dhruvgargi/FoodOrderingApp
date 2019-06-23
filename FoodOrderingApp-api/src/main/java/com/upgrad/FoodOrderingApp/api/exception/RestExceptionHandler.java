package com.upgrad.FoodOrderingApp.api.exception;

import com.upgrad.FoodOrderingApp.api.requestmodal.ErrorResponse;
import com.upgrad.FoodOrderingApp.service.exception.SignUpRestrictedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler extends Exception {

    @ExceptionHandler(SignUpRestrictedException.class)
    public ResponseEntity<ErrorResponse> signupRestrictedException(SignUpRestrictedException sex, WebRequest request){
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(sex.getCode()).message(sex.getErrorMessage()), HttpStatus.CONFLICT);
    }

}
