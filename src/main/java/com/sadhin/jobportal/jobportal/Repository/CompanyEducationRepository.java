package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CompanyEducationQualification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyEducationRepository extends JpaRepository<CompanyEducationQualification,Long> {
}
