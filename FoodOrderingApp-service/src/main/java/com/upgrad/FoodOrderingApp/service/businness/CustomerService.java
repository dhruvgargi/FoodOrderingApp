package com.upgrad.FoodOrderingApp.service.businness;

import com.upgrad.FoodOrderingApp.service.exception.SignUpRestrictedException;
import com.upgrad.FoodOrderingApp.service.model.CustomerModel;

public interface CustomerService {

    CustomerModel registerUser(CustomerModel customer) throws SignUpRestrictedException;

    Boolean loginUser(CustomerModel customer);

    Boolean logoutCustomer(CustomerModel customer);

    Boolean updateCustomer(CustomerModel customer);

    Boolean updatePassword(CustomerModel customer);



}
