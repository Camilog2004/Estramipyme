package com.example.estramipyme.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Company")
public class Company {

    @Id
    @Column(name = "id_company", length = 15)
    private String idCompany;

    @Column(name = "name_company", length = 100, nullable = false)
    private String nameCompany;

    @Column(name = "email_company", length = 99, nullable = false)
    private String emailCompany;

    @Column(name = "password_company", length = 20, nullable = false)
    private String passwordCompany;

    @Column(name = "user_type_company", length = 1, nullable = false)
    private String userTypeCompany;

    @Column(name = "company_size", length = 1, nullable = false)
    private String companySize;

    @Column(name = "company_field", length = 1, nullable = false)
    private String companyField;

    @Column(name = "register_date_company", nullable = false)
    private LocalDate registerDateCompany;

    @Column(name = "download_book_company", nullable = false)
    private boolean downloadBookCompany;
}
