package com.sadhin.jobportal.jobportal.Entity;

import com.sadhin.jobportal.jobportal.Enum.DegreeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "education_qualification")
@Entity
@Getter
@Setter
public class CompanyEducationQualification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id",unique = true, updatable = false, nullable = false)
    private Long id;

    @Column
    private String degreeName;

    @Column
    private DegreeType degreeType;

    @Column
    private String degreeTitle;


    @Column String majorSubject;

    @ManyToOne()
    @JoinColumn(name = "company_job_post_id", referencedColumnName = "id")
    private CompanyJobPostEntity jobPost;

    public CompanyEducationQualification() {
    }
    public CompanyEducationQualification(Long id, String degreeName, DegreeType degreeType, String degreeTitle, String majorSubject, CompanyJobPostEntity jobPost) {
        this.id = id;
        this.degreeName = degreeName;
        this.degreeType = degreeType;
        this.degreeTitle = degreeTitle;
        this.majorSubject = majorSubject;
        this.jobPost = jobPost;
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

    public CompanyJobPostEntity getJobPost() {
        return jobPost;
    }

    public void setJobPost(CompanyJobPostEntity jobPost) {
        this.jobPost = jobPost;
    }
}
