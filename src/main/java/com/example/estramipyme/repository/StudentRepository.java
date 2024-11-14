package com.example.estramipyme.repository;


import com.example.estramipyme.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
