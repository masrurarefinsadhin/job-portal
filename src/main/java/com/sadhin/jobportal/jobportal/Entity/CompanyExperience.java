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
    @Column(name = "id",unique = true, updatable = false, nullable = false)
    private UUID id;

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
