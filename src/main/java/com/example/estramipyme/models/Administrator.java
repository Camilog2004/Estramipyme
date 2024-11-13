package com.example.estramipyme.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Administrator")
public class Administrator {

    @Id
    @Column(name = "id_administrator", length = 15)
    private String idAdministrator;

    @Column(name = "email_administrator", length = 99, nullable = false)
    private String emailAdministrator;

    @Column(name = "password_administrator", length = 20, nullable = false)
    private String passwordAdministrator;
}
