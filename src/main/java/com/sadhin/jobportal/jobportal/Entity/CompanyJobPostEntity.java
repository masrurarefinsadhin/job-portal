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
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id",unique = true,updatable = false, nullable = false)
    private UUID id;

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
}
