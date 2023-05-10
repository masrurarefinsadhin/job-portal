package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.GenderType;
import com.sadhin.jobportal.jobportal.Enum.SkillType;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
@Entity
@Data
@Table(name = "candidate_user")
public class CandidateUserEntity  {
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
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true)
    private String primaryEmail;

    @Column
    private GenderType genderType;

    @Column
    private SkillType skillType;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private  UserEntity userEntity;




}
