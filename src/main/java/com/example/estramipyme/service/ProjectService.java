package com.example.estramipyme.service;

import com.example.estramipyme.models.Company;
import com.example.estramipyme.models.Project;
import com.example.estramipyme.models.Teacher;
import com.example.estramipyme.repository.CompanyRepository;
import com.example.estramipyme.repository.ProjectRepository;
import com.example.estramipyme.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CompanyRepository companyRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(long id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        Project existingProject=projectRepository.findByNameProject(project.getNameProject());
        if(existingProject!=null) {
            return null;
        }
        Teacher teacher = teacherRepository.findById(project.getIdTeacher().getIdTeacher()).orElse(null);
        Company company = companyRepository.findById(project.getIdCompany().getId()).orElse(null);

        if(teacher == null || company == null) {
            return null;
        }
        project.setIdTeacher(teacher);
        project.setIdCompany(company);
        return projectRepository.save(project);
    }

    public Project updateProject(long id, Project project) {
        Project existingProject=projectRepository.findById(id).orElse(null);
        if(existingProject == null) {
            return null;
        }
        Teacher teacher = teacherRepository.findById(project.getIdTeacher().getIdTeacher()).orElse(null);
        Company company = companyRepository.findById(project.getIdCompany().getId()).orElse(null);

        existingProject.setNameProject(project.getNameProject()==null ? existingProject.getNameProject() : project.getNameProject());
        existingProject.setIdTeacher(teacher==null ? existingProject.getIdTeacher() : teacher);
        existingProject.setIdCompany(company==null ? existingProject.getIdCompany() : company);
        return projectRepository.save(existingProject);
    }

    public void deleteProject(long id) {
        projectRepository.deleteById(id);
    }
}
