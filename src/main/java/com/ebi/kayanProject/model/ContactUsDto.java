package com.ebi.kayanProject.model;

import com.ebi.kayanProject.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactUsDto {
    private Long id;
    private String type;
    private String content;
    private UserDto user;
}
