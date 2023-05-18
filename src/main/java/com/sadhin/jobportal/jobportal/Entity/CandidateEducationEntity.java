package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.DegreeType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "candidate_education")
@Getter
@Setter
public class CandidateEducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
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
    public CandidateEducationEntity() {
    }
    public CandidateEducationEntity(Long id, String degreeName, DegreeType degreeType, String instituteName, String instituteAddress, String boardName, LocalDate startDate, LocalDate endDate, Double maxGrade, Double achievedGrade, String description, String majorSubject, CandidateResumeEntity candidateResume) {
        this.id = id;
        this.degreeName = degreeName;
        this.degreeType = degreeType;
        this.instituteName = instituteName;
        this.instituteAddress = instituteAddress;
        this.boardName = boardName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxGrade = maxGrade;
        this.achievedGrade = achievedGrade;
        this.description = description;
        this.majorSubject = majorSubject;
        this.candidateResume = candidateResume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstituteAddress() {
        return instituteAddress;
    }

    public void setInstituteAddress(String instituteAddress) {
        this.instituteAddress = instituteAddress;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
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

    public Double getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(Double maxGrade) {
        this.maxGrade = maxGrade;
    }

    public Double getAchievedGrade() {
        return achievedGrade;
    }

    public void setAchievedGrade(Double achievedGrade) {
        this.achievedGrade = achievedGrade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public CandidateResumeEntity getCandidateResume() {
        return candidateResume;
    }

    public void setCandidateResume(CandidateResumeEntity candidateResume) {
        this.candidateResume = candidateResume;
    }
}
