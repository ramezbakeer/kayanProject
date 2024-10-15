package com.ebi.kayanProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="contactus")
public class ContactUsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="messagetype")
    private String type;
    @Column(name="messagecontent")
    private String content;
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;
}
