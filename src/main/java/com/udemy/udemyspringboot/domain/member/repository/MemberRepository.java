package com.udemy.udemyspringboot.domain.member.repository;

import com.udemy.udemyspringboot.domain.member.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Student, Long> {
}
