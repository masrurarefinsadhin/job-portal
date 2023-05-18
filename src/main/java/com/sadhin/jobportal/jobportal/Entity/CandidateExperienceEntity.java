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
    @Column(name = "id")
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
    public CandidateExperienceEntity() {
    }
    public CandidateExperienceEntity(Long id, com.sadhin.jobportal.jobportal.Enum.ExperienceType experienceType, String experienceTitle, String companyName, String designation, LocalDate startDate, LocalDate endDate, String description, CandidateResumeEntity candidateResume) {
        this.id = id;
        ExperienceType = experienceType;
        ExperienceTitle = experienceTitle;
        this.companyName = companyName;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.candidateResume = candidateResume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.sadhin.jobportal.jobportal.Enum.ExperienceType getExperienceType() {
        return ExperienceType;
    }

    public void setExperienceType(com.sadhin.jobportal.jobportal.Enum.ExperienceType experienceType) {
        ExperienceType = experienceType;
    }

    public String getExperienceTitle() {
        return ExperienceTitle;
    }

    public void setExperienceTitle(String experienceTitle) {
        ExperienceTitle = experienceTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CandidateResumeEntity getCandidateResume() {
        return candidateResume;
    }

    public void setCandidateResume(CandidateResumeEntity candidateResume) {
        this.candidateResume = candidateResume;
    }
}
