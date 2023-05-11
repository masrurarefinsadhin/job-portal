package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.DegreeType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "candidate_education")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateEducationEntity {

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
    @Column(unique = true, updatable = false, nullable = false)
    private UUID id;

    @Column
    private String degreeName;

    @Column
    private DegreeType degreeType;

    @Column
    private String instituteName;

    @Column
    private String instituteAddress;

    @Column
    private String boardName;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private Double maxGrade;

    @Column
    private Double achievedGrade;

    @Column
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate-resume_id", referencedColumnName = "id")
    private CandidateResumeEntity candidateResume;


}
