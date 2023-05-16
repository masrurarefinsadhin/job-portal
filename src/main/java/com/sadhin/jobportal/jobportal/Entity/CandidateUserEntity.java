package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.GenderType;
import com.sadhin.jobportal.jobportal.Enum.SkillType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "candidate_user")
public class CandidateUserEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;


    @Column
    private GenderType genderType;


    @Column
    private SkillType skillType;

    @OneToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private   UserEntity userEntity;

    /*@OneToOne(mappedBy = "candidateUserEntity", cascade = CascadeType.ALL)
    private CandidateResumeEntity candidateResumeEntityList;*/

    public CandidateUserEntity(){}


    public CandidateUserEntity(Long id, String firstName, String lastName, GenderType genderType, SkillType skillType, UserEntity userEntity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderType = genderType;
        this.skillType = skillType;
        this.userEntity = userEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
