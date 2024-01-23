package com.elclubdelatabladelsiete.GestorNotas.model.mapper;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;

import javax.swing.text.html.parser.Entity;

public class StudentMapper {
    public static StudentEntity ModelToEntity(StudentRequest request){
       return StudentEntity.builder()
               .name(request.getName())
               .lastName(request.getLastName())
               .build();
    }

    public static StudentResponse EntityToModel(StudentEntity entity){
        return StudentResponse.builder()
                .name(entity.getName())
                .lastName(entity.getLastName())
                .build();
    }
}
