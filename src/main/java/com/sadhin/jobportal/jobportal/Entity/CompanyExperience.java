package com.sadhin.jobportal.jobportal.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "company_experience")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private Integer minYearsOfExperience;

    @Column
    private Integer maxYearsOfExperience;

    @Column
    private String areaOfExpertise;

    //skill1,skill2,skill3
    @Column
    private String listOfSkill;

    @ManyToOne()
    @JoinColumn(name = "company_job_post_id", referencedColumnName = "id")
    private CompanyJobPostEntity jobPost;

    public CompanyExperience() {
    }
    public CompanyExperience(Long id, Integer minYearsOfExperience, Integer maxYearsOfExperience, String areaOfExpertise, String listOfSkill, CompanyJobPostEntity jobPost) {
        this.id = id;
        this.minYearsOfExperience = minYearsOfExperience;
        this.maxYearsOfExperience = maxYearsOfExperience;
        this.areaOfExpertise = areaOfExpertise;
        this.listOfSkill = listOfSkill;
        this.jobPost = jobPost;
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

    public CompanyJobPostEntity getJobPost() {
        return jobPost;
    }

    public void setJobPost(CompanyJobPostEntity jobPost) {
        this.jobPost = jobPost;
    }
}
