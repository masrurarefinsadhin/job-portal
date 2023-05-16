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
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyJobPostEntity jobPost;
}
