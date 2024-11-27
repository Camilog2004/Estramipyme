package com.example.estramipyme.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_test")
    private Integer idTest;

    @Column(name = "question_1", length = 500, nullable = false)
    private String pregunta1;

    @Column(name = "question_2", length = 500, nullable = false)
    private String pregunta2;

    @Column(name = "question_3", length = 500, nullable = false)
    private String pregunta3;

    @Column(name = "question_4", length = 500, nullable = false)
    private String pregunta4;

    @Column(name = "question_5", length = 500, nullable = false)
    private String pregunta5;

    @Column(name = "question_6", length = 500, nullable = false)
    private String pregunta6;

    @Column(name = "question_7", length = 500, nullable = false)
    private String pregunta7;

    @Column(name = "question_8", length = 500, nullable = false)
    private String pregunta8;

    @Column(name = "question_9", length = 500, nullable = false)
    private String pregunta9;

    @ManyToOne
    @JoinColumn(name = "id_company", nullable = false)
    private Company id_empresa;
}
