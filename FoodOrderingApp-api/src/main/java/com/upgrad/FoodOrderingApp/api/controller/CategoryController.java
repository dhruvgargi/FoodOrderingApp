package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.requestmodal.CategoriesListResponse;
import com.upgrad.FoodOrderingApp.api.requestmodal.CategoryDetailsResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Api(value = "Category Controller: ",description = "end-points for getting categories related information")
public class CategoryController {


    @GetMapping(value = "/{category_id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Retrieve Category based upon the Category ID")
    public ResponseEntity<CategoryDetailsResponse> getCategoriesById(@PathVariable("category_id") String categoryId){

        return new ResponseEntity<CategoryDetailsResponse>(HttpStatus.OK);
    }

    @GetMapping("/")
    @ApiOperation(value = "Retrieve all Categories", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CategoriesListResponse> getCategories(){

        return new ResponseEntity<CategoriesListResponse>(HttpStatus.OK);
    }


}


