package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.requestmodal.ItemListResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@Api(value = "Item Controller", description = "endpoint for getting all the items.")
public class ItemController {



    @GetMapping(value = "/restaurant/{restaurant_id}")
    @ApiOperation("Retrieve details for all the Restaurants")
    public ResponseEntity<ItemListResponse> getRestaurants(@PathVariable("restaurant_id") String restaurantId){

        return new ResponseEntity<ItemListResponse>(HttpStatus.OK);
    }

}
