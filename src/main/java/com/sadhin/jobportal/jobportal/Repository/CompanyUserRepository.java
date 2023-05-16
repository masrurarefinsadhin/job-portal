package com.sadhin.jobportal.jobportal.Repository;

import com.sadhin.jobportal.jobportal.Entity.CompanyUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CompanyUserRepository extends JpaRepository<CompanyUserEntity,Long> {
    @Query(value = "select c from CompanyUserEntity c where c.userEntity.primaryEmail = :email and c.userEntity.password = :password")
    Optional<CompanyUserEntity> findByEmailAndPassword(String email, String password);
}
