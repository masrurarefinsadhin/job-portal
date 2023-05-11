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
    @Column(unique = true,updatable = false, nullable = false)
    private UUID id;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate-resume_id", referencedColumnName = "id")
    private CandidateResumeEntity candidateResume;
}
