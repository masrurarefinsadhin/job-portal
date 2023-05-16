package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Enum.GenderType;
import com.sadhin.jobportal.jobportal.Enum.SkillType;
import com.sadhin.jobportal.jobportal.Enum.UserType;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

public class CandidateUserDto {

    private Long candidateId;
    private Long userId;
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String password;
    private String previousPassword;
    private Integer primaryContactNumber;
    private GenderType genderType;
    private SkillType skillType;
    private Instant cratedAt;
    private Instant updatedAt;
    private UserType userType;
    private String currentAddress;

    public CandidateUserDto() {
    }
    public CandidateUserDto(Long candidateId,
                            Long userId,
                            String firstName,
                            String lastName,
                            String primaryEmail,
                            String password,
                            String previousPassword,
                            Integer primaryContactNumber,
                            GenderType genderType,
                            SkillType skillType,
                            Instant cratedAt,
                            Instant updatedAt,
                            UserType userType, String currentAddress) {
        this.candidateId = candidateId;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.primaryEmail = primaryEmail;
        this.password = password;
        this.previousPassword = previousPassword;
        this.primaryContactNumber = primaryContactNumber;
        this.genderType = genderType;
        this.skillType = skillType;
        this.cratedAt = cratedAt;
        this.updatedAt = updatedAt;
        this.userType = userType;
        this.currentAddress = currentAddress;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
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

    public Integer getPrimaryContactNumber() {
        return primaryContactNumber;
    }

    public void setPrimaryContactNumber(Integer primaryContactNumber) {
        this.primaryContactNumber = primaryContactNumber;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
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

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
}
