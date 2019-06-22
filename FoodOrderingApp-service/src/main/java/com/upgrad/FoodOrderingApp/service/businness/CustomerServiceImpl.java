package com.upgrad.FoodOrderingApp.service.businness;


import com.upgrad.FoodOrderingApp.service.dao.CustomerRepositoryImpl;
import com.upgrad.FoodOrderingApp.service.entity.CustomerEntity;
import com.upgrad.FoodOrderingApp.service.exception.SignUpRestrictedException;
import com.upgrad.FoodOrderingApp.service.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerEntity customerEntity;

    @Autowired
    CustomerRepositoryImpl customerRepository;

    @Autowired
    CustomerModel customerModel;

    @Autowired
    PasswordCryptographyProvider passwordEncrypt;

    @Transactional(propagation = Propagation.REQUIRED)
    public CustomerModel registerUser(CustomerModel customer) throws SignUpRestrictedException{
        System.out.println(customer);

        validateCustomer(customer);

        customerEntity = customerRepository.getCustomerByContactNumber(customer.getContactNumber());

        if(customerEntity!=null){
            throw new SignUpRestrictedException("SGR-001","This contact number is already registered! Try other contact number");
        }
        else
        customerEntity = new CustomerEntity();

        customerEntity.setContactNumber(customer.getContactNumber());
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setEmailAddress(customer.getEmailAddress());
        String[] encryptedPassword = passwordEncrypt.encrypt(customer.getPassword());
        customerEntity.setSalt(encryptedPassword[0]);
        customerEntity.setPassword(encryptedPassword[1]);
        customerEntity.setUuid(customer.getuUId());

        customerEntity = customerRepository.registerUser(customerEntity);
        customer.setuUId(customerEntity.getUuid());

        return customer;
    }

    private void validateCustomer(CustomerModel customer) throws SignUpRestrictedException{

        String invalidValue = "string";
        long contactNumber;

        if(customer.getFirstName()==null||customer.getPassword()==null||customer.getContactNumber()==null||
        customer.getEmailAddress()==null||customer.getFirstName().equalsIgnoreCase(invalidValue)
        ||customer.getPassword().equalsIgnoreCase(invalidValue)||customer.getContactNumber().equalsIgnoreCase(invalidValue)
        ||customer.getEmailAddress().equalsIgnoreCase(invalidValue))
        {
            throw new SignUpRestrictedException("SGR-005","Except last name all fields should be filled.");
        }

        try{
            contactNumber = Long.parseLong(customer.getContactNumber());
        }catch(NumberFormatException nex){
            throw new SignUpRestrictedException("SGR-003","Invalid contact number!");
        }

        if(!customer.getEmailAddress().equalsIgnoreCase("xxx.x"))
        throw new SignUpRestrictedException("SGR-002","Invalid email-id format!");

        if(customer.getPassword().length()<8)
        throw new SignUpRestrictedException("SGR-004","Weak Password!");


    }

    public Boolean loginUser(CustomerModel customer){

        return false;
    };

    public Boolean logoutCustomer(CustomerModel customer){

        return false;
    };

    public Boolean updateCustomer(CustomerModel customer){

        return false;
    };

    public Boolean updatePassword(CustomerModel customer){

        return false;
    };


}

