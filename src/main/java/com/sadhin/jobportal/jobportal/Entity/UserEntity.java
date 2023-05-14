package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.UserType;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "user_repository")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity{

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
    @Column(name = "id",unique = true, updatable = false, nullable = false)
    private UUID id;

    @Column(unique = true)
    private String primaryEmail;

    @Column(unique = true)
    private String primaryContactNumber;

    @Column
    private Instant cratedAt;

    @Column

    private Instant updatedAt;

    @Column
    private UserType userType;

    @Column
    private String password;

    @Column
    private String previousPassword;


    @PrePersist
    public void PrePersist() {
        if (this.cratedAt == null) this.cratedAt = Instant.now();
        if (this.updatedAt == null) this.updatedAt = Instant.now();
        if (this.previousPassword== null) this.previousPassword = this.password;
    }

    @PreUpdate
    public void PreUpdate() {
        this.previousPassword = this.password;
    }

    public UserEntity() {
    }
    public UserEntity(UUID id,
                      String primaryEmail,
                      String primaryContactNumber,
                      Instant cratedAt,
                      Instant updatedAt,
                      UserType userType,
                      String password,
                      String previousPassword
    ) {
        this.id = id;
        this.primaryEmail = primaryEmail;
        this.primaryContactNumber = primaryContactNumber;
        this.cratedAt = cratedAt;
        this.updatedAt = updatedAt;
        this.userType = userType;
        this.password = password;
        this.previousPassword = previousPassword;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getPrimaryContactNumber() {
        return primaryContactNumber;
    }

    public void setPrimaryContactNumber(String primaryContactNumber) {
        this.primaryContactNumber = primaryContactNumber;
    }

    public Instant getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(Instant cratedAt) {
        this.cratedAt = cratedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreviousPassword() {
        return previousPassword;
    }

    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }

}
