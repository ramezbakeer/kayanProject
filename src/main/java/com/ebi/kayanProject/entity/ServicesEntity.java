package com.ebi.kayanProject.entity;

import com.ebi.kayanProject.model.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "services")
public class ServicesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "description")
    private String description;
    @ManyToMany(mappedBy = "servicesList")
    private List<UserEntity> userEntities = new ArrayList<>();
}
