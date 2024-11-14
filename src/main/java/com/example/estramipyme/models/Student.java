package com.example.estramipyme.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "id_student",nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_project")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "id_teacher",nullable = false)
    private Teacher teacher;




}
