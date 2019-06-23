package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.CustomerEntity;

public interface CustomerRepository {


    public CustomerEntity getCustomerByContactNumber(String customerContactNumber);

}
