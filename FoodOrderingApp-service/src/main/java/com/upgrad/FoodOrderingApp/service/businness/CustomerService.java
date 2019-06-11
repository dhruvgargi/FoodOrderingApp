package com.upgrad.FoodOrderingApp.service.businness;

import com.upgrad.FoodOrderingApp.service.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Boolean signupCustomerService(Customer customer);

}
