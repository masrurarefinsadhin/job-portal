package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CandidateResumeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CandidateResumeRepository extends JpaRepository<CandidateResumeEntity, Long> {

    @Query(value = "select r from CandidateResumeEntity r where r.candidateUserEntity.id = :id")
    Optional<CandidateResumeEntity> findByCandidateUserId(Long id);


    @Query(value = "delete from CandidateResumeEntity r where r.id = :id")
    void deleteByResumeId(Long id);


}
