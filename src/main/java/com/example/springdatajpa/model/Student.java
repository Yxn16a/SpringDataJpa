package com.example.springdatajpa.model;

import lombok.*;

import javax.persistence.*;

@ToString
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student",
        uniqueConstraints = @UniqueConstraint(
                name = "student_email_unique",
                columnNames = "email"
        )
)
public class Student extends BaseEntity {
   private Long studentId;
    @Column(name = "first_name",
            nullable = false)

    private String firstName;

    @Column(name = "last_name",
            nullable = false
    )
    private String lastName;

    @Column(name = "email",
            nullable = false
    )
    private String email;

    @Column(name = "age",
            nullable = false
    )
    //  columnDefinition ="TEXT"
    private String age;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "guardian_name")),
            @AttributeOverride(name = "email", column = @Column(name = "guardian_email")),
            @AttributeOverride(name = "mobile", column = @Column(name = "guardian_mobile"))
    })
    private Guardia guardia;

}
