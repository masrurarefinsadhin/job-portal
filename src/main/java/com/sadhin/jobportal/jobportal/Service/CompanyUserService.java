package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CompanyUserDto;
import com.sadhin.jobportal.jobportal.Dto.PostDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;

import java.util.List;

public interface CompanyUserService {
    boolean save(CompanyUserDto companyUserDto);
    CompanyUserDto findByEmailAndPassword(String email, String password);
    boolean createJobPost(PostDto postDto);

    List<ResumeDto> getResumeList();
}
