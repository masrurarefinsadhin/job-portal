package com.sadhin.jobportal.jobportal.Dto;

import javax.persistence.Column;

public class CompanyExperienceDto {
    private Long id;
    private Integer minYearsOfExperience;
    private Integer maxYearsOfExperience;
    private String areaOfExpertise;

    //skill1,skill2,skill3
    private String listOfSkill;
    public CompanyExperienceDto() {
    }
    public CompanyExperienceDto(Long id, Integer minYearsOfExperience, Integer maxYearsOfExperience, String areaOfExpertise, String listOfSkill) {
        this.id = id;
        this.minYearsOfExperience = minYearsOfExperience;
        this.maxYearsOfExperience = maxYearsOfExperience;
        this.areaOfExpertise = areaOfExpertise;
        this.listOfSkill = listOfSkill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMinYearsOfExperience() {
        return minYearsOfExperience;
    }

    public void setMinYearsOfExperience(Integer minYearsOfExperience) {
        this.minYearsOfExperience = minYearsOfExperience;
    }

    public Integer getMaxYearsOfExperience() {
        return maxYearsOfExperience;
    }

    public void setMaxYearsOfExperience(Integer maxYearsOfExperience) {
        this.maxYearsOfExperience = maxYearsOfExperience;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public String getListOfSkill() {
        return listOfSkill;
    }

    public void setListOfSkill(String listOfSkill) {
        this.listOfSkill = listOfSkill;
    }
}
