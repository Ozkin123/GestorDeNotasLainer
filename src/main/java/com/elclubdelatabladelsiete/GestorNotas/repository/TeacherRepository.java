package com.elclubdelatabladelsiete.GestorNotas.repository;

import com.elclubdelatabladelsiete.GestorNotas.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer> {
}
