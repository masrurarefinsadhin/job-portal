package com.sadhin.jobportal.jobportal.Entity;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "apply", uniqueConstraints = @UniqueConstraint(columnNames = {"candidate_resume_id", "job_post_id"}))
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
    public ApplyEntity() {
    }
    public ApplyEntity(Long id, CandidateResumeEntity candidateResume, CompanyJobPostEntity jobPost, Instant appliedAt, String status) {
        this.id = id;
        this.candidateResume = candidateResume;
        this.jobPost = jobPost;
        this.appliedAt = appliedAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CandidateResumeEntity getCandidateResume() {
        return candidateResume;
    }

    public void setCandidateResume(CandidateResumeEntity candidateResume) {
        this.candidateResume = candidateResume;
    }

    public CompanyJobPostEntity getJobPost() {
        return jobPost;
    }

    public void setJobPost(CompanyJobPostEntity jobPost) {
        this.jobPost = jobPost;
    }

    public Instant getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(Instant appliedAt) {
        this.appliedAt = appliedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
