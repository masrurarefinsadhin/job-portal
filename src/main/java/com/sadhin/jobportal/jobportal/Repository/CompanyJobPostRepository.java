package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CompanyJobPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CompanyJobPostRepository extends JpaRepository<CompanyJobPostEntity, Long> {
/*
    List<CompanyJobPostEntity> findAllByCompanyUserEntityId(Long id);
*/
}
