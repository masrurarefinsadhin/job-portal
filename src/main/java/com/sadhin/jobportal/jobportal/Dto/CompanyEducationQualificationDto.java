package com.sadhin.jobportal.jobportal.Dto;

import com.sadhin.jobportal.jobportal.Enum.DegreeType;

import javax.persistence.Column;

public class CompanyEducationQualificationDto {
    private Long id;
    private String degreeName;
    private DegreeType degreeType;
    private String degreeTitle;
    private String majorSubject;
    public CompanyEducationQualificationDto() {
    }
    public CompanyEducationQualificationDto(Long id, String degreeName, DegreeType degreeType, String degreeTitle, String majorSubject) {
        this.id = id;
        this.degreeName = degreeName;
        this.degreeType = degreeType;
        this.degreeTitle = degreeTitle;
        this.majorSubject = majorSubject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }
}
