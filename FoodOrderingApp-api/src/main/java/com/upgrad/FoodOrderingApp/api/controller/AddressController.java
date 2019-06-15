package com.upgrad.FoodOrderingApp.api.controller;


import com.upgrad.FoodOrderingApp.api.requestmodal.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@Api(value = "Address Controller",description = "end-points for address details related information")
public class AddressController {


    @GetMapping(value = "/states",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Retrieve list of states")
    public ResponseEntity<StatesList> getAllStates(){

        return new ResponseEntity<StatesList>(HttpStatus.OK);
    }

    @DeleteMapping("/address/{address_id}")
    @ApiOperation(value = "Delete the address corresponding to specified Address ID")
    public ResponseEntity<DeleteAddressResponse> deleteAddress(@PathVariable("address_id") String addressId) {

        return new ResponseEntity<DeleteAddressResponse>(HttpStatus.OK);
    }


    @GetMapping(value = "/address/customer",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Retrieve Address Details for all the Customers")
    public ResponseEntity<AddressListResponse> getAllAddress(){

        return new ResponseEntity<AddressListResponse>(HttpStatus.OK);
    }

    @PostMapping(value = "/address",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Save Address Details for specified Customer")
    public ResponseEntity<SaveAddressResponse> saveAddress(@RequestBody SaveAddressRequest saveAddressRequest){

        return new ResponseEntity<SaveAddressResponse>(HttpStatus.CREATED);
    }


}


