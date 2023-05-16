package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Entity.CandidateEducationEntity;
import com.sadhin.jobportal.jobportal.Entity.CandidateExperienceEntity;
import com.sadhin.jobportal.jobportal.Entity.CandidateUserEntity;
import com.sadhin.jobportal.jobportal.Enum.BloodGroup;
import com.sadhin.jobportal.jobportal.Enum.MaritalStatus;
import com.sadhin.jobportal.jobportal.Enum.NationalityType;
import com.sadhin.jobportal.jobportal.Enum.ReligionType;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Data
public class ResumeDto {
    private Long id;
    private Long candidateUserId;
    private String fatherName;
    private String motherName;
    private String presentAddress;
    private String permanentAddress;
    private LocalDate dateOfBirth;
    private NationalityType nationalityType;
    private Long nationalIdNumber;
    private ReligionType religionType;
    private MaritalStatus maritalStatus;
    private Long SecondaryContactNumber;
    private BloodGroup bloodGroup;
    private String secondaryEmail;
    private List<CandidateEducationEntity> educationList;
    private List<CandidateExperienceEntity> experienceList;
    public ResumeDto() {
    }
    public ResumeDto(Long id, Long candidateUserId, String fatherName, String motherName, String presentAddress, String permanentAddress, LocalDate dateOfBirth, NationalityType nationalityType, Long nationalIdNumber, ReligionType religionType, MaritalStatus maritalStatus, Long secondaryContactNumber, BloodGroup bloodGroup, String secondaryEmail, List<CandidateEducationEntity> educationList, List<CandidateExperienceEntity> experienceList) {
        this.id = id;
        this.candidateUserId = candidateUserId;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.dateOfBirth = dateOfBirth;
        this.nationalityType = nationalityType;
        this.nationalIdNumber = nationalIdNumber;
        this.religionType = religionType;
        this.maritalStatus = maritalStatus;
        SecondaryContactNumber = secondaryContactNumber;
        this.bloodGroup = bloodGroup;
        this.secondaryEmail = secondaryEmail;
        this.educationList = educationList;
        this.experienceList = experienceList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCandidateUserId() {
        return candidateUserId;
    }

    public void setCandidateUserId(Long candidateUserId) {
        this.candidateUserId = candidateUserId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public NationalityType getNationalityType() {
        return nationalityType;
    }

    public void setNationalityType(NationalityType nationalityType) {
        this.nationalityType = nationalityType;
    }

    public Long getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(Long nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public ReligionType getReligionType() {
        return religionType;
    }

    public void setReligionType(ReligionType religionType) {
        this.religionType = religionType;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Long getSecondaryContactNumber() {
        return SecondaryContactNumber;
    }

    public void setSecondaryContactNumber(Long secondaryContactNumber) {
        SecondaryContactNumber = secondaryContactNumber;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public List<CandidateEducationEntity> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<CandidateEducationEntity> educationList) {
        this.educationList = educationList;
    }

    public List<CandidateExperienceEntity> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<CandidateExperienceEntity> experienceList) {
        this.experienceList = experienceList;
    }
}
