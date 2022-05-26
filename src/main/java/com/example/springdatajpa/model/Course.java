package com.example.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course extends BaseEntity {
    private Long courseId;
    private String title;
    private Integer credit;
    @OneToOne(
            mappedBy = "course"
    )
    // no need of putting the join column
    private CourseMaterial courseMaterial;
    @ManyToOne
    @JoinColumn(name = "teacher_id",
    referencedColumnName = "teacherId")
    private Teacher teacher;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
         name = "student_courses_map",
         joinColumns= @JoinColumn(
                 name ="course_id",
                 referencedColumnName = "courseId"
         ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            )
    )
    private Set< Student> student = new HashSet<>();

}
