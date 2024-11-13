package com.example.estramipyme.service;

import com.example.estramipyme.models.Teacher;
import com.example.estramipyme.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(String id) {
        return teacherRepository.findById(id);
    }

    public Teacher saveTeacher(Teacher teacher) {
        Optional<Teacher> existingTeacher=teacherRepository.findById(teacher.getIdTeacher());
        if(existingTeacher.isPresent()) {
            return null;
        }
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id) {
        teacherRepository.deleteById(id);
    }

    public  Teacher updateTeacher(String id,Teacher teacher) {
        Teacher existingTeacher=teacherRepository.findById(id).orElse(null);

        if(existingTeacher == null) {
            return null;
        }

        existingTeacher.setEmailTeacher(teacher.getEmailTeacher()==null ? existingTeacher.getEmailTeacher() : teacher.getEmailTeacher());
        existingTeacher.setPasswordTeacher(teacher.getPasswordTeacher()==null ? existingTeacher.getPasswordTeacher() : teacher.getPasswordTeacher());
        return teacherRepository.save(existingTeacher);
    }
}

