package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CandidateEducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateEducationRepository extends JpaRepository<CandidateEducationEntity, Long> {
    @Query(value = "select e from CandidateEducationEntity e where e.id =:id")
    CandidateEducationEntity findByEducationId(Long id);

    @Query("delete from CandidateEducationEntity e where e.candidateResume =:id")
    void deleteByCandidateResumeId(Long id);

    @Query(value = "select e from CandidateEducationEntity e where e.candidateResume.id =:id")
    List<CandidateEducationEntity> findAllByCandidateResumeId(Long id);
}
