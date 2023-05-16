package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Table(name = "job_post")
@Entity
public class CompanyJobPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",unique = true,updatable = false, nullable = false)
    private Long id;

    @Column
    private String jobTitle;



    @Column
    private Integer vacancy;

    @Column
    private SkillType requiredSkill;

    @Column
    private JobType jobType;

    @Column
    private LocalDate deadline;

    @Column
    private String context;


    @Column
    private String jobResponsibility;

    @Column
    private JobLevel jobLevel;

    @Column
    private String jobLocation;

    @Column
    private Integer maxSalary;

    @Column
    private Integer minSalary;

    @Column
    private SalaryType salaryType;

    @Column
    private LunchFacilityType lunchFacilityType;

    @Column
    private SalaryReview salaryReview;

    @Column
    private Integer numberOfYearlyBonus;

    @Column
    private Workplace workplace;

    @Column
    private GenderType genderType;

    @Column
    private Integer ageMin;

    @Column
    private Integer ageMax;

    @OneToMany(mappedBy = "jobPost",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<CompanyEducationQualification> educationQualificationList;

    @OneToMany(mappedBy = "jobPost",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<CompanyExperience> companyExperienceList;

    @ManyToOne()
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyUserEntity companyUserEntity;

    @OneToMany(mappedBy = "jobPost",cascade = CascadeType.ALL)
    private List<ApplyEntity> applyEntityList;

    public CompanyJobPostEntity() {
    }

    public CompanyJobPostEntity(Long id, String jobTitle, Integer vacancy, SkillType requiredSkill, JobType jobType, LocalDate deadline, String context, String jobResponsibility, JobLevel jobLevel, String jobLocation, Integer maxSalary, Integer minSalary, SalaryType salaryType, LunchFacilityType lunchFacilityType, SalaryReview salaryReview, Integer numberOfYearlyBonus, Workplace workplace, GenderType genderType, Integer ageMin, Integer ageMax, List<CompanyEducationQualification> educationQualificationList, List<CompanyExperience> companyExperienceList, CompanyUserEntity companyUserEntity) {
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
        this.companyUserEntity = companyUserEntity;
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

    public List<CompanyEducationQualification> getEducationQualificationList() {
        return educationQualificationList;
    }

    public void setEducationQualificationList(List<CompanyEducationQualification> educationQualificationList) {
        this.educationQualificationList = educationQualificationList;
    }

    public List<CompanyExperience> getCompanyExperienceList() {
        return companyExperienceList;
    }

    public void setCompanyExperienceList(List<CompanyExperience> companyExperienceList) {
        this.companyExperienceList = companyExperienceList;
    }

    public CompanyUserEntity getCompanyUserEntity() {
        return companyUserEntity;
    }

    public void setCompanyUserEntity(CompanyUserEntity companyUserEntity) {
        this.companyUserEntity = companyUserEntity;
    }
}
