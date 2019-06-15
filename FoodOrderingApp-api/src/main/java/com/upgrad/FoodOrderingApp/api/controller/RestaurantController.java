package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.requestmodal.RestaurantDetailsResponse;
import com.upgrad.FoodOrderingApp.api.requestmodal.RestaurantList;
import com.upgrad.FoodOrderingApp.api.requestmodal.RestaurantListResponse;
import com.upgrad.FoodOrderingApp.api.requestmodal.RestaurantUpdatedResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
@Api(value = "Restaurant Controller",description = "end-points for getting restaurant related information")
public class RestaurantController {

    @PutMapping("/{restaurant_id}")
    @ApiOperation(value="Update restaurant details based upon the Restaurant ID")
    public ResponseEntity<RestaurantUpdatedResponse> updateRestaurantDetails(@PathVariable("restaurant_id") String restaurantId){

        return new ResponseEntity<RestaurantUpdatedResponse>(HttpStatus.OK);
    }

    @GetMapping("/{restaurant_id}")
    @ApiOperation(value = "Retrieve restaurant details based upon the Restaurant ID")
        public ResponseEntity<RestaurantListResponse> getRestaurantDetailsById(@PathVariable("restaurant_id") String restaurantId){

        return new ResponseEntity<RestaurantListResponse>(HttpStatus.OK);
    }

    @GetMapping("/category/{category_id}")
    @ApiOperation(value = "Retrieve restaurant details based upon the Category ID")
    public ResponseEntity<RestaurantListResponse> getRestaurantDetailsByCategoryId(@PathVariable("category_id") String restaurantId){

        return new ResponseEntity<RestaurantListResponse>(HttpStatus.OK);
    }

    @GetMapping("/name/{restaurant_name}")
    @ApiOperation(value="Retrieve restaurant details based upon the Restaurant Name")
    public ResponseEntity<RestaurantDetailsResponse> getRestaurantDetailsByName(@PathVariable("restaurant_name") String restaurantName){

        return new ResponseEntity<RestaurantDetailsResponse>(HttpStatus.OK);
    }

    @GetMapping("/")
    @ApiOperation(value="Retrieve list of all the restaurants")
    public ResponseEntity<RestaurantListResponse> getRestaurants(){

        return new ResponseEntity<RestaurantListResponse>(HttpStatus.OK);
    }




}
