package com.elclubdelatabladelsiete.GestorNotas.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class TeacherEntity {

    @Column()
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    @Column
    private String name;
    @Column
    private String lastName;



}
