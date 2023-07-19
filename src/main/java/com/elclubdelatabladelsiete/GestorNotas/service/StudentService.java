package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest); //model
    StudentEntity getStudentById (Integer id); //model
    StudentEntity updateStudent(StudentEntity studentEntity); //model

    void deleteStudent(Integer id); //model

}
