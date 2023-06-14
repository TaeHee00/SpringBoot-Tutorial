package com.udemy.udemyspringboot.domain.member.controller;

import com.udemy.udemyspringboot.domain.member.domain.Student;
import com.udemy.udemyspringboot.domain.member.dto.StudentCreateRequest;
import com.udemy.udemyspringboot.domain.member.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberController {

    private final StudentService studentService;

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Long studentId) {
        Optional<Student> student = studentService.searchStudent(studentId);

        return student.orElse(null);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody StudentCreateRequest request) {
        Student student = Student.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();
        Student saveStudent = studentService.createStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveStudent);
    }
}
