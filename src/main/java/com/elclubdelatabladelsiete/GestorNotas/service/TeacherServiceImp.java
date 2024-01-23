package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.entity.TeacherEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.mapper.TeacherMapper;
import com.elclubdelatabladelsiete.GestorNotas.model.request.TeacherRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.TeacherResponse;
import com.elclubdelatabladelsiete.GestorNotas.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherServiceImp implements TeacherService{

    @Autowired
    private final TeacherRepository teacherRepository;

    public TeacherServiceImp(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public TeacherResponse addTeacher(TeacherRequest teacherRequest) {
        return TeacherMapper.entityToModel(teacherRepository.save(TeacherMapper.modelToEntity(teacherRequest)));
    }

    @Override
    public TeacherResponse updateTeacher(Integer id,TeacherRequest teacherRequest) {
        TeacherEntity entity = TeacherMapper.modelToEntity(teacherRequest);
        entity.setId(id);
        return TeacherMapper.entityToModel(teacherRepository.save(entity));
    }

    @Override
    public TeacherResponse getTeacherById(Integer id) {
        return TeacherMapper.entityToModel(teacherRepository.getReferenceById(id));
    }

    @Override
    public void deleteTeacherById(Integer id) {
        teacherRepository.deleteById(id);
    }


}
