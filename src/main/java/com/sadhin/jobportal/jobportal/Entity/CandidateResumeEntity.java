package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.NationalityType;
import com.sadhin.jobportal.jobportal.Enum.ReligionType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate_resume")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateResumeEntity {
    @Id
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
    }
    )
    @Column(unique = true,updatable = false, nullable = false)
    private String id;

    @Column
    private String fatherName;

    @Column
    private String motherName;

    @Column
    private String presentAddress;

    @Column
    private String permanentAddress;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private NationalityType nationalityType;

    @Column(unique = true)
    private Long nationalIdNumber;

    @Column
    private ReligionType religionType;

    @OneToMany(mappedBy = "candidateResume")
    private List<CandidateEducationEntity> educationList;

    @OneToMany(mappedBy = "candidateResume")
    private List<CandidateExperienceEntity> experienceList;


}
