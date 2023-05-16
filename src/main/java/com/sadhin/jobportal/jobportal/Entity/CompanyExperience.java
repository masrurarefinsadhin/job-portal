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
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyJobPostEntity jobPost;
}
