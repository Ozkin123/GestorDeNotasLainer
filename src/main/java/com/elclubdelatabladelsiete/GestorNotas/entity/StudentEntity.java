package com.elclubdelatabladelsiete.GestorNotas.entity;

import lombok.*;

import javax.persistence.*;
@Builder
@Data
@Entity
@Table(name = "students")
public class StudentEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String lastName;
}
