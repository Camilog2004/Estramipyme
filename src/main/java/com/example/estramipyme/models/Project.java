package com.example.estramipyme.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_project",length = 100,nullable = false)
    private String nameProject;

    @ManyToOne
    @JoinColumn(name = "id_teacher",nullable = false)
    private Teacher idTeacher;

    @ManyToOne
    @JoinColumn(name = "id_company",nullable = false)
    private Company idCompany;


}
