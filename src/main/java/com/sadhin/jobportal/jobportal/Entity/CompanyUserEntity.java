package com.sadhin.jobportal.jobportal.Entity;


import com.sadhin.jobportal.jobportal.Enum.IndustryType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Table(name = "company_user")
@Entity
@Getter
@Setter
public class CompanyUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",unique = true,updatable = false, nullable = false)
    private Long id;

    @Column(unique = true)
    private String companyName;

    @Column
    private LocalDate timeOfEstablishment;

    @Column
    private Integer maxNumberOfEmployee;

    @Column
    private Integer minNumberOfEmployee;

    @Column
    private String companyAddress;

    @Column
    private IndustryType industryType;

    @Column
    private String primaryPersonName;

    @Column
    private String primaryPersonDesignation;

    @OneToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id",unique = true)
    private   UserEntity userEntity;

    @OneToMany(mappedBy = "companyUserEntity", cascade = CascadeType.ALL)
    private List<CompanyJobPostEntity> jobPostList;

    public CompanyUserEntity() {
    }
    public CompanyUserEntity(Long id, String companyName, LocalDate timeOfEstablishment, Integer maxNumberOfEmployee, Integer minNumberOfEmployee, String companyAddress, IndustryType industryType, String primaryPersonName, String primaryPersonDesignation, UserEntity userEntity, List<CompanyJobPostEntity> jobPostList) {
        this.id = id;
        this.companyName = companyName;
        this.timeOfEstablishment = timeOfEstablishment;
        this.maxNumberOfEmployee = maxNumberOfEmployee;
        this.minNumberOfEmployee = minNumberOfEmployee;
        this.companyAddress = companyAddress;
        this.industryType = industryType;
        this.primaryPersonName = primaryPersonName;
        this.primaryPersonDesignation = primaryPersonDesignation;
        this.userEntity = userEntity;
        this.jobPostList = jobPostList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<CompanyJobPostEntity> getJobPostList() {
        return jobPostList;
    }

    public void setJobPostList(List<CompanyJobPostEntity> jobPostList) {
        this.jobPostList = jobPostList;
    }
}
