package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Enum.IndustryType;
import com.sadhin.jobportal.jobportal.Enum.UserType;
import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyUserDto {
    private UUID id;

    private UUID userId;

    private String primaryEmail;

    private Integer primaryContactNumber;

    private Instant cratedAt;

    private Instant updatedAt;

    private UserType userType;

    private String password;

    private String previousPassword;

    private String companyName;

    private LocalDate timeOfEstablishment;

    private Integer maxNumberOfEmployee;

    private Integer minNumberOfEmployee;

    private String companyAddress;

    private IndustryType industryType;

    private String primaryPersonName;

    private String primaryPersonDesignation;

}
