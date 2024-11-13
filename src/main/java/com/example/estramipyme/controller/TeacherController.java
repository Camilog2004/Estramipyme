package com.example.estramipyme.controller;

import com.example.estramipyme.models.Teacher;
import com.example.estramipyme.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable String id) {
        Teacher teacher = teacherService.getTeacherById(id).orElse(null);

        if (teacher == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(teacher);
    }

    @PostMapping()
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        Teacher newteacher = teacherService.saveTeacher(teacher);
        if (newteacher == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(newteacher);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable String id, @RequestBody Teacher teacher) {
        Teacher updatedTeacher = teacherService.updateTeacher(id, teacher);

        if (updatedTeacher == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().body(updatedTeacher);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Teacher> deleteTeacher(@PathVariable String id) {
        teacherService.deleteTeacher(id);
        return ResponseEntity.ok().build();
    }


}
