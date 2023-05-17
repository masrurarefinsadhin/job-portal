package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Dto.ApplyDto;
import com.sadhin.jobportal.jobportal.Entity.ApplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplyRepository extends JpaRepository<ApplyEntity, Long> {
}
