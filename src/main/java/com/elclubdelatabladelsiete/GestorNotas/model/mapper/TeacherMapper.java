package com.elclubdelatabladelsiete.GestorNotas.model.mapper;

import com.elclubdelatabladelsiete.GestorNotas.entity.TeacherEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.request.TeacherRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.TeacherResponse;

public class TeacherMapper {
    public static TeacherResponse entityToModel(TeacherEntity teacherEntity){
        return TeacherResponse.builder().name(teacherEntity.getName())
                .lastName(teacherEntity.getLastName()).build();
    }

    public static TeacherEntity modelToEntity(TeacherRequest teacherRequest){
        return TeacherEntity.builder().name(teacherRequest.getName())
                .lastName(teacherRequest.getLastName()).build();
    }


}
