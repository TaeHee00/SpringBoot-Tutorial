package com.udemy.udemyspringboot.domain.member.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentCreateRequest {

    private String firstName;
    private String lastName;
}
