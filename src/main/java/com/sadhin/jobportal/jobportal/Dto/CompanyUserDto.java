package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Enum.IndustryType;
import com.sadhin.jobportal.jobportal.Enum.UserType;
import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;
@Data
public class CompanyUserDto {
    private Long id;

    private Long userId;

    private String primaryEmail;

    private Integer primaryContactNumber;

    private Instant cratedAt;

    private Instant updatedAt;

    private UserType userType;

    private String password;

    private String previousPassword;

    private String companyName;

    private LocalDate timeOfEstablishment;

    private Integer maxNumberOfEmployee;

    private Integer minNumberOfEmployee;

    private String companyAddress;

    private IndustryType industryType;

    private String primaryPersonName;

    private String primaryPersonDesignation;
    public CompanyUserDto() {
    }
    public CompanyUserDto(Long id, Long userId, String primaryEmail, Integer primaryContactNumber, Instant cratedAt, Instant updatedAt, UserType userType, String password, String previousPassword, String companyName, LocalDate timeOfEstablishment, Integer maxNumberOfEmployee, Integer minNumberOfEmployee, String companyAddress, IndustryType industryType, String primaryPersonName, String primaryPersonDesignation) {
        this.id = id;
        this.userId = userId;
        this.primaryEmail = primaryEmail;
        this.primaryContactNumber = primaryContactNumber;
        this.cratedAt = cratedAt;
        this.updatedAt = updatedAt;
        this.userType = userType;
        this.password = password;
        this.previousPassword = previousPassword;
        this.companyName = companyName;
        this.timeOfEstablishment = timeOfEstablishment;
        this.maxNumberOfEmployee = maxNumberOfEmployee;
        this.minNumberOfEmployee = minNumberOfEmployee;
        this.companyAddress = companyAddress;
        this.industryType = industryType;
        this.primaryPersonName = primaryPersonName;
        this.primaryPersonDesignation = primaryPersonDesignation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public Integer getPrimaryContactNumber() {
        return primaryContactNumber;
    }

    public void setPrimaryContactNumber(Integer primaryContactNumber) {
        this.primaryContactNumber = primaryContactNumber;
    }

    public Instant getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(Instant cratedAt) {
        this.cratedAt = cratedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreviousPassword() {
        return previousPassword;
    }

    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getTimeOfEstablishment() {
        return timeOfEstablishment;
    }

    public void setTimeOfEstablishment(LocalDate timeOfEstablishment) {
        this.timeOfEstablishment = timeOfEstablishment;
    }

    public Integer getMaxNumberOfEmployee() {
        return maxNumberOfEmployee;
    }

    public void setMaxNumberOfEmployee(Integer maxNumberOfEmployee) {
        this.maxNumberOfEmployee = maxNumberOfEmployee;
    }

    public Integer getMinNumberOfEmployee() {
        return minNumberOfEmployee;
    }

    public void setMinNumberOfEmployee(Integer minNumberOfEmployee) {
        this.minNumberOfEmployee = minNumberOfEmployee;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public IndustryType getIndustryType() {
        return industryType;
    }

    public void setIndustryType(IndustryType industryType) {
        this.industryType = industryType;
    }

    public String getPrimaryPersonName() {
        return primaryPersonName;
    }

    public void setPrimaryPersonName(String primaryPersonName) {
        this.primaryPersonName = primaryPersonName;
    }

    public String getPrimaryPersonDesignation() {
        return primaryPersonDesignation;
    }

    public void setPrimaryPersonDesignation(String primaryPersonDesignation) {
        this.primaryPersonDesignation = primaryPersonDesignation;
    }
}
