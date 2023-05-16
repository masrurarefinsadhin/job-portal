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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",unique = true,updatable = false, nullable = false)
    private Long id;

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

    @Column
    private String majorSubject;


    @ManyToOne
    @JoinColumn(name = "candidate_resume_id", referencedColumnName = "id")
    private CandidateResumeEntity candidateResume;


}
