package com.example.estramipyme.repository;

import com.example.estramipyme.models.Project;
import com.example.estramipyme.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findByNameProject(String name);
}
