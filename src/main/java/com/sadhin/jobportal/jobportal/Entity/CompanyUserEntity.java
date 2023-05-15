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
@NoArgsConstructor
@AllArgsConstructor
public class CompanyUserEntity {
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
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private   UserEntity userEntity;

    @OneToMany(mappedBy = "companyUserEntity", cascade = CascadeType.ALL)
    private List<CompanyJobPostEntity> jobPostList;


}
