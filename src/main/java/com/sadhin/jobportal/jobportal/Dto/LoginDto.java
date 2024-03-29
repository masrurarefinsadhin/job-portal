package com.sadhin.jobportal.jobportal.Dto;

import lombok.Data;

public class LoginDto {
    public String email;
    public String password;

    public LoginDto() {
    }
    public LoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
