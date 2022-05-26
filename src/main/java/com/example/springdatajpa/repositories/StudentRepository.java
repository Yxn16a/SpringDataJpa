package com.example.springdatajpa.repositories;

import com.example.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    @Query("select s from Student s where s.email = ?1") // ?1 first parameter passed
    Student getStudentByEmailAddress (String Email);
    @Query(
            value = "select * from Student s where s.email = ?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative (String Email);


    // multiple in put
    @Query(
            value = "select * from Student s where s.email : email",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNamedParam (@Param("email") String Email);
}
