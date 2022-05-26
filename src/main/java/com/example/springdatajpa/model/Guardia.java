package com.example.springdatajpa.model;

import lombok.*;

import javax.persistence.*;

@Embeddable
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guardia {
    private String name;
    private String email;
    private String mobile;
}
