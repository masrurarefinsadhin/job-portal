package com.sadhin.jobportal.jobportal.Entity;


import com.sadhin.jobportal.jobportal.Enum.ExperienceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "candidate_experience")
public class CandidateExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",unique = true,updatable = false, nullable = false)
    private Long id;

    @Column
    private ExperienceType ExperienceType;

    @Column
    private String ExperienceTitle;

    @Column
    private String companyName;

    @Column
    private String designation;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "candidate_resume_id", referencedColumnName = "id")
    private CandidateResumeEntity candidateResume;
}
