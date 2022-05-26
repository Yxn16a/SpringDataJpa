package com.example.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher extends BaseEntity {
    private Long teacherId;
    private String firstName;
    private String lastName;

    // whever possible use many to one
//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "teachers_id",
//            referencedColumnName = "teacherId"
//    )
//    private List<Course> course = new ArrayList<>();
}
