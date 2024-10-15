package com.ebi.kayanProject.entity;

import jakarta.persistence.*;
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
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fname")
    private String fName;
    @Column(name = "lname")
    private String lName;
    private String email;
    private String password;
    private String phone;
    private String address;
    @Column(name = "jobtitle")
    private String jobTitle;
    @ManyToMany
    @JoinTable(
            name = "Users_Tasks"
            , joinColumns = @JoinColumn(name = "User_id")
            , inverseJoinColumns = @JoinColumn(name = "Service_id")
    )
    private List<ServicesEntity> servicesList;

}
