package com.udemy.udemyspringboot.domain.member.service;

import com.udemy.udemyspringboot.domain.member.domain.Student;
import com.udemy.udemyspringboot.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final MemberRepository memberRepository;

    public Optional<Student> searchStudent(Long studentId) {
        return memberRepository.findById(studentId);
    }

    public Student createStudent(Student student) {
        return memberRepository.save(student);
    }
}
