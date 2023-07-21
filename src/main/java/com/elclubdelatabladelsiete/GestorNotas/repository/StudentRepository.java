package com.elclubdelatabladelsiete.GestorNotas.repository;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {


}
