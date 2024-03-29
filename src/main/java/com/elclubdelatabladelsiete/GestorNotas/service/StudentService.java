package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest); //model
    StudentResponse getStudentById (Integer id); //model
    StudentResponse updateStudent(Integer id,StudentRequest studentRequest); //model

    void deleteStudent(Integer id); //model

}
