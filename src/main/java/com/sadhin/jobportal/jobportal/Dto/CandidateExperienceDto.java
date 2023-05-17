package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Enum.ExperienceType;

import javax.persistence.Column;
import java.time.LocalDate;

public class CandidateExperienceDto {
    private Long id;

    private ExperienceType ExperienceType;

    private String ExperienceTitle;

    private String companyName;

    private String designation;

    private LocalDate startDate;

    private LocalDate endDate;

    private String description;
    public CandidateExperienceDto() {
    }
    public CandidateExperienceDto(Long id, com.sadhin.jobportal.jobportal.Enum.ExperienceType experienceType, String experienceTitle, String companyName, String designation, LocalDate startDate, LocalDate endDate, String description) {
        this.id = id;
        ExperienceType = experienceType;
        ExperienceTitle = experienceTitle;
        this.companyName = companyName;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.sadhin.jobportal.jobportal.Enum.ExperienceType getExperienceType() {
        return ExperienceType;
    }

    public void setExperienceType(com.sadhin.jobportal.jobportal.Enum.ExperienceType experienceType) {
        ExperienceType = experienceType;
    }

    public String getExperienceTitle() {
        return ExperienceTitle;
    }

    public void setExperienceTitle(String experienceTitle) {
        ExperienceTitle = experienceTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
