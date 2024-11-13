package com.example.estramipyme.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Teacher")
public class Teacher {

    @Id
    @Column(name = "id_teacher",length = 15)
    private String idTeacher;

    @Column(name = "email_teacher",length = 99,nullable = false)
    private String emailTeacher;

    @Column(name = "password_teacher",length = 20,nullable = false)
    private String passwordTeacher;

}
