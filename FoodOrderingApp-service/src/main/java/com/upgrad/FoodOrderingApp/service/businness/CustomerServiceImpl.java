package com.upgrad.FoodOrderingApp.service.businness;


import com.upgrad.FoodOrderingApp.service.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    public Boolean signupCustomerService(Customer customer){
        System.out.println(customer);
        return false;
    }

}

