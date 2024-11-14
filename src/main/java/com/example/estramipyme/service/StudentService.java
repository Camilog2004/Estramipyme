package com.example.estramipyme.service;

import com.example.estramipyme.models.Project;
import com.example.estramipyme.models.Student;
import com.example.estramipyme.models.Teacher;
import com.example.estramipyme.repository.ProjectRepository;
import com.example.estramipyme.repository.StudentRepository;
import com.example.estramipyme.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        if (existingStudent != null) {
            return null;
        }

        Teacher teacher = teacherRepository.findById(student.getTeacher().getIdTeacher()).orElse(null);
        Project project= projectRepository.findById(student.getProject().getId()).orElse(null);

        if(teacher==null || project==null){
            return null;
        }
        student.setTeacher(teacher);
        student.setProject(project);

        return studentRepository.save(student);
    }

    public Student updateStudent(long id, Student student) {

        Student existingStudent=studentRepository.findById(id).orElse(null);

        if(existingStudent==null){
            return null;
        }

        Teacher teacher = teacherRepository.findById(student.getTeacher().getIdTeacher()).orElse(null);
        Project project= projectRepository.findById(student.getProject().getId()).orElse(null);

        existingStudent.setProject(project==null ? existingStudent.getProject() : project );
        existingStudent.setTeacher(teacher==null ? existingStudent.getTeacher() : teacher);

        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
