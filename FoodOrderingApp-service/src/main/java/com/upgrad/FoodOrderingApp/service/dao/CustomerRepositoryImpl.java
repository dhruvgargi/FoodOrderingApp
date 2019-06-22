package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    @PersistenceContext
    private EntityManager entityManager;

    private CustomerEntity customerEntity;

    public CustomerEntity getCustomerByContactNumber(String customerContactNumber){
       try {
           customerEntity = entityManager.createNamedQuery("getCustomerByContactNumber", CustomerEntity.class)
                   .setParameter("contactNumber", customerContactNumber).getSingleResult();
       }catch(NoResultException nre){
           return null;
       }
       return customerEntity;
   }

   public CustomerEntity registerUser(CustomerEntity customer){
        entityManager.persist(customer);
        customerEntity = getCustomerByContactNumber(customer.getContactNumber());
        return customerEntity;
   }

}
