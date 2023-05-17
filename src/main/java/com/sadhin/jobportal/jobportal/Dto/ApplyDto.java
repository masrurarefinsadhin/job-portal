package com.sadhin.jobportal.jobportal.Dto;


public class ApplyDto {
    private Long id;
    private Long candidateUserId;
    private Long jobPostId;

    public ApplyDto() {
    }

    public ApplyDto(Long id, Long candidateUserId, Long jobPostId) {
        this.id = id;
        this.candidateUserId = candidateUserId;
        this.jobPostId = jobPostId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCandidateUserId() {
        return candidateUserId;
    }

    public void setCandidateUserId(Long candidateUserId) {
        this.candidateUserId = candidateUserId;
    }

    public Long getJobPostId() {
        return jobPostId;
    }

    public void setJobPostId(Long jobPostId) {
        this.jobPostId = jobPostId;
    }
}
