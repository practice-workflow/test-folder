package com.example.submoduletest.student;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Table(name = "student")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Student{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(length = 64, nullable = false)
    private String name;

    @Builder
    public Student(String name) {
        this.name = name;
    }
}