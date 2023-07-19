package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.mapper.StudentMapper;
import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;
import com.elclubdelatabladelsiete.GestorNotas.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@AllArgsConstructor
@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public StudentResponse addStudent(StudentRequest studentRequest) {
        StudentEntity entity =
                studentRepository.save(StudentMapper.ModelToEntity(studentRequest));
        return StudentMapper.EntityToModel(entity);
    }

    @Override
    public StudentEntity getStudentById(Integer id) {

        studentRepository.getReferenceById(id);
        return null;
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {

    }
}


