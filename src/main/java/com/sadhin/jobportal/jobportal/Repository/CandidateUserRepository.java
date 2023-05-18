package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CandidateUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CandidateUserRepository extends JpaRepository<CandidateUserEntity, Long> {
    @Query(value = "select c from CandidateUserEntity c where c.userEntity.primaryEmail = :email and c.userEntity.password = :password")
    Optional<CandidateUserEntity> findByEmailAndPassword(String email, String password);



}
