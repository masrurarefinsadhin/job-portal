package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Entity.CompanyEducationQualification;
import com.sadhin.jobportal.jobportal.Entity.CompanyExperience;
import com.sadhin.jobportal.jobportal.Enum.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyJobPostDto {
        private Long id;

        private Long companyId;

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
}
