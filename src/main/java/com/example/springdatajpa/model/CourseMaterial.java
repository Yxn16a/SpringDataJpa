package com.example.springdatajpa.model;

import javax.persistence.*;

@Entity
public class CourseMaterial extends BaseEntity{
    private Long courseMaterialId;
    private String url;
    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
   @JoinColumn(
            name ="course_id",
           referencedColumnName = "courseId")
    // this means that course_id will be a column that will be
    //created in the courseMaterial side,and it is referencing course
    //id
    // Lazy fetch: if it does not work use exclude the course
    private Course course;
}
