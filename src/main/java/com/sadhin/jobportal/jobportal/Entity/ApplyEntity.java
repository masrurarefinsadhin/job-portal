package com.sadhin.jobportal.jobportal.Entity;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "apply")
@Entity
public class ApplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_resume_id")
    private CandidateResumeEntity candidateResume;

    @ManyToOne
    @JoinColumn(name = "job_post_id")
    private CompanyJobPostEntity jobPost;

    @Column
    private Instant appliedAt;

    @Column
    private String status;


}
