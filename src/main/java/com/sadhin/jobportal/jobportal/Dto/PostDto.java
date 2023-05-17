package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Entity.CompanyEducationQualification;
import com.sadhin.jobportal.jobportal.Entity.CompanyExperience;
import com.sadhin.jobportal.jobportal.Entity.CompanyUserEntity;
import com.sadhin.jobportal.jobportal.Enum.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class PostDto {
    private Long id;
    private String jobTitle;
    private Integer vacancy;
    private SkillType requiredSkill;
    private JobType jobType;
    private LocalDate deadline;
    private String context;
    private String jobResponsibility;
    private JobLevel jobLevel;
    private String jobLocation;
    private Integer maxSalary;
    private Integer minSalary;
    private SalaryType salaryType;
    private LunchFacilityType lunchFacilityType;
    private SalaryReview salaryReview;
    private Integer numberOfYearlyBonus;
    private Workplace workplace;
    private GenderType genderType;
    private Integer ageMin;
    private Integer ageMax;
    private Long companyUserId;
    List<CompanyEducationQualificationDto> educationQualificationList;
    List<CompanyExperienceDto> companyExperienceList;

    public PostDto() {
    }
    public PostDto(Long id, String jobTitle, Integer vacancy, SkillType requiredSkill, JobType jobType, LocalDate deadline, String context, String jobResponsibility, JobLevel jobLevel, String jobLocation, Integer maxSalary, Integer minSalary, SalaryType salaryType, LunchFacilityType lunchFacilityType, SalaryReview salaryReview, Integer numberOfYearlyBonus, Workplace workplace, GenderType genderType, Integer ageMin, Integer ageMax, List<CompanyEducationQualificationDto> educationQualificationList, List<CompanyExperienceDto> companyExperienceList, Long companyUserId) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.vacancy = vacancy;
        this.requiredSkill = requiredSkill;
        this.jobType = jobType;
        this.deadline = deadline;
        this.context = context;
        this.jobResponsibility = jobResponsibility;
        this.jobLevel = jobLevel;
        this.jobLocation = jobLocation;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.salaryType = salaryType;
        this.lunchFacilityType = lunchFacilityType;
        this.salaryReview = salaryReview;
        this.numberOfYearlyBonus = numberOfYearlyBonus;
        this.workplace = workplace;
        this.genderType = genderType;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.educationQualificationList = educationQualificationList;
        this.companyExperienceList = companyExperienceList;
        this.companyUserId = companyUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getVacancy() {
        return vacancy;
    }

    public void setVacancy(Integer vacancy) {
        this.vacancy = vacancy;
    }

    public SkillType getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(SkillType requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getJobResponsibility() {
        return jobResponsibility;
    }

    public void setJobResponsibility(String jobResponsibility) {
        this.jobResponsibility = jobResponsibility;
    }

    public JobLevel getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(JobLevel jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryType salaryType) {
        this.salaryType = salaryType;
    }

    public LunchFacilityType getLunchFacilityType() {
        return lunchFacilityType;
    }

    public void setLunchFacilityType(LunchFacilityType lunchFacilityType) {
        this.lunchFacilityType = lunchFacilityType;
    }

    public SalaryReview getSalaryReview() {
        return salaryReview;
    }

    public void setSalaryReview(SalaryReview salaryReview) {
        this.salaryReview = salaryReview;
    }

    public Integer getNumberOfYearlyBonus() {
        return numberOfYearlyBonus;
    }

    public void setNumberOfYearlyBonus(Integer numberOfYearlyBonus) {
        this.numberOfYearlyBonus = numberOfYearlyBonus;
    }

    public Workplace getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }

    public List<CompanyEducationQualificationDto> getEducationQualificationList() {
        return educationQualificationList;
    }

    public void setEducationQualificationList(List<CompanyEducationQualificationDto> educationQualificationList) {
        this.educationQualificationList = educationQualificationList;
    }

    public List<CompanyExperienceDto> getCompanyExperienceList() {
        return companyExperienceList;
    }

    public void setCompanyExperienceList(List<CompanyExperienceDto> companyExperienceList) {
        this.companyExperienceList = companyExperienceList;
    }

    public Long getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(Long companyUserId) {
        this.companyUserId = companyUserId;
    }
}
