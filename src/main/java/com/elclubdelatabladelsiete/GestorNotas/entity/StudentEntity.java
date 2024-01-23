package com.elclubdelatabladelsiete.GestorNotas.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
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

//    public StudentEntity() {
//    }
//
//    public StudentEntity(Integer id, String name, String lastName) {
//        this.id = id;
//        this.name = name;
//        this.lastName = lastName;
//    }
}
