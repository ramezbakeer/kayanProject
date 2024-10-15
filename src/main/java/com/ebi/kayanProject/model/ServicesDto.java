package com.ebi.kayanProject.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServicesDto {

    private Long id;
    private String serviceName;
    private String description;
    private List<UserDto> users = new ArrayList<>();
}
