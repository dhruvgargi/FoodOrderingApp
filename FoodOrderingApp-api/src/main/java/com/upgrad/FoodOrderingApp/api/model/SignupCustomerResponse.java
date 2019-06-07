package com.upgrad.FoodOrderingApp.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class SignupCustomerResponse {
    @JsonProperty("id")
    private String id = null;
    @JsonProperty("status")
    private String status = null;

    public SignupCustomerResponse() {
    }

    public SignupCustomerResponse id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "uuid of the signed up customer"
    )
    @NotNull
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignupCustomerResponse status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "message showing the status of the signed up customer"
    )
    @NotNull
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SignupCustomerResponse signupCustomerResponse = (SignupCustomerResponse)o;
            return Objects.equals(this.id, signupCustomerResponse.id) && Objects.equals(this.status, signupCustomerResponse.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignupCustomerResponse {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

