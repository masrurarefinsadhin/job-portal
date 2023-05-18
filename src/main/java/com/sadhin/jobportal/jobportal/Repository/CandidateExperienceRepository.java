package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CandidateExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateExperienceRepository extends JpaRepository<CandidateExperienceEntity, Long> {
    @Query(value = "delete from CandidateExperienceEntity e where e.candidateResume =:id")
    void deleteByCandidateResumeId(Long id);

    @Query(value = "select e from CandidateExperienceEntity e where e.candidateResume.id =:id")
    List<CandidateExperienceEntity> findAllByCandidateResumeId(Long id);
}
