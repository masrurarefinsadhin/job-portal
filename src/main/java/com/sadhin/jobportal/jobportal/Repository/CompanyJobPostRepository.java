package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CompanyJobPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyJobPostRepository extends JpaRepository<CompanyJobPostEntity, Long> {
}
