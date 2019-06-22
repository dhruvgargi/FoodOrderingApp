package com.upgrad.FoodOrderingApp.service.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class CustomerModel implements Serializable {


    private String firstName;
    private String lastName;
    private String emailAddress;
    private String contactNumber;
    private String password;
    private String oldPassword;
    private String newPassword;

    public String getuUId() {
        return uUId;
    }

    public void setuUId(String uUId) {
        this.uUId = uUId;
    }

    private String uUId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String toString(){
        return "CustomerEntity Object : [ First Name: - "+this.firstName+" - Last Name: -"+this.lastName+" - Email Address- "+this.emailAddress
                +" - Contact Number -"+this.contactNumber+" - Password: -"+this.password;
    }

}
