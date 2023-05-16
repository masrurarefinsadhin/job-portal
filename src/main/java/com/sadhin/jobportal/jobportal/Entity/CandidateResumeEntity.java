package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.BloodGroup;
import com.sadhin.jobportal.jobportal.Enum.MaritalStatus;
import com.sadhin.jobportal.jobportal.Enum.NationalityType;
import com.sadhin.jobportal.jobportal.Enum.ReligionType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate_resume")
@AllArgsConstructor
@Getter
@Setter
public class CandidateResumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id", unique = true,updatable = false, nullable = false)
    private Long id;

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

    @Column
    private Long nationalIdNumber;

    @Column
    private ReligionType religionType;

    @Column
    private MaritalStatus maritalStatus;

    @Column
    private Long SecondaryContactNumber;

    @Column
    private BloodGroup bloodGroup;

    @Column
    private String secondaryEmail;

    @OneToMany(mappedBy = "candidateResume", cascade = CascadeType.ALL)
    private List<CandidateEducationEntity> educationList;

    @OneToMany(mappedBy = "candidateResume", cascade = CascadeType.ALL)
    private List<CandidateExperienceEntity> experienceList;

    @OneToOne
    @JoinColumn(name = "candidate_user_id", referencedColumnName = "id", unique = true)
    private CandidateUserEntity candidateUserEntity;

    @OneToMany(mappedBy = "candidateResume", cascade = CascadeType.ALL)
    private List<ApplyEntity> applyEntityList;

    public CandidateResumeEntity() {
    }
    public CandidateResumeEntity(Long id, String fatherName, String motherName, String presentAddress, String permanentAddress, LocalDate dateOfBirth, NationalityType nationalityType, Long nationalIdNumber, ReligionType religionType, MaritalStatus maritalStatus, Long secondaryContactNumber, BloodGroup bloodGroup, String secondaryEmail, List<CandidateEducationEntity> educationList, List<CandidateExperienceEntity> experienceList, CandidateUserEntity candidateUserEntity) {
        this.id = id;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.dateOfBirth = dateOfBirth;
        this.nationalityType = nationalityType;
        this.nationalIdNumber = nationalIdNumber;
        this.religionType = religionType;
        this.maritalStatus = maritalStatus;
        SecondaryContactNumber = secondaryContactNumber;
        this.bloodGroup = bloodGroup;
        this.secondaryEmail = secondaryEmail;
        this.educationList = educationList;
        this.experienceList = experienceList;
        this.candidateUserEntity = candidateUserEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public NationalityType getNationalityType() {
        return nationalityType;
    }

    public void setNationalityType(NationalityType nationalityType) {
        this.nationalityType = nationalityType;
    }

    public Long getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(Long nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public ReligionType getReligionType() {
        return religionType;
    }

    public void setReligionType(ReligionType religionType) {
        this.religionType = religionType;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Long getSecondaryContactNumber() {
        return SecondaryContactNumber;
    }

    public void setSecondaryContactNumber(Long secondaryContactNumber) {
        SecondaryContactNumber = secondaryContactNumber;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public List<CandidateEducationEntity> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<CandidateEducationEntity> educationList) {
        this.educationList = educationList;
    }

    public List<CandidateExperienceEntity> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<CandidateExperienceEntity> experienceList) {
        this.experienceList = experienceList;
    }

    public CandidateUserEntity getCandidateUserEntity() {
        return candidateUserEntity;
    }

    public void setCandidateUserEntity(CandidateUserEntity candidateUserEntity) {
        this.candidateUserEntity = candidateUserEntity;
    }
}
