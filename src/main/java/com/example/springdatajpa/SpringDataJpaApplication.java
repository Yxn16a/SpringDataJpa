package com.example.springdatajpa;

import com.example.springdatajpa.model.Student;
import com.example.springdatajpa.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
// @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student maria = new Student(
//                    "Maria",
//                    "Jones",
//                    "maria.jonesA@gmail.com",
//                    "21"
//            );
//            studentRepository.save(maria);
//        };
// }

    // using builder
//    Student maria = Student.builder()
//            .firstName("Maria")
//            .lastName("Jones")
//            .age("21")
//            .email("jones@gmail.com")
//            .build();

}
