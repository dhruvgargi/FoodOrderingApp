package com.upgrad.FoodOrderingApp.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class SignupCustomerRequest {
    @JsonProperty("first_name")
    private String firstName = null;
    @JsonProperty("last_name")
    private String lastName = null;
    @JsonProperty("email_address")
    private String emailAddress = null;
    @JsonProperty("contact_number")
    private String contactNumber = null;
    @JsonProperty("password")
    private String password = null;

    public SignupCustomerRequest() {
    }

    public SignupCustomerRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "First name of the new customer"
    )
    @NotNull
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public SignupCustomerRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @ApiModelProperty("Last name of the new customer")
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SignupCustomerRequest emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Email address of the new customer"
    )
    @NotNull
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public SignupCustomerRequest contactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Contact Number of the new customer"
    )
    @NotNull
    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public SignupCustomerRequest password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Password of the new customer"
    )
    @NotNull
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SignupCustomerRequest signupCustomerRequest = (SignupCustomerRequest)o;
            return Objects.equals(this.firstName, signupCustomerRequest.firstName) && Objects.equals(this.lastName, signupCustomerRequest.lastName) && Objects.equals(this.emailAddress, signupCustomerRequest.emailAddress) && Objects.equals(this.contactNumber, signupCustomerRequest.contactNumber) && Objects.equals(this.password, signupCustomerRequest.password);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.emailAddress, this.contactNumber, this.password});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignupCustomerRequest {\n");
        sb.append("    firstName: ").append(this.toIndentedString(this.firstName)).append("\n");
        sb.append("    lastName: ").append(this.toIndentedString(this.lastName)).append("\n");
        sb.append("    emailAddress: ").append(this.toIndentedString(this.emailAddress)).append("\n");
        sb.append("    contactNumber: ").append(this.toIndentedString(this.contactNumber)).append("\n");
        sb.append("    password: ").append(this.toIndentedString(this.password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

