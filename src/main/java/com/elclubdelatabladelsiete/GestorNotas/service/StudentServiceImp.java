package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.entity.StudentEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.mapper.StudentMapper;
import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;
import com.elclubdelatabladelsiete.GestorNotas.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public StudentResponse addStudent(StudentRequest studentRequest) {
        StudentEntity entity =
                studentRepository.save(StudentMapper.ModelToEntity(studentRequest));
        return StudentMapper.EntityToModel(entity);
    }

    @Override
    public StudentResponse getStudentById(Integer id) {
        return StudentMapper.EntityToModel(studentRepository.getById(id));
    }

    @Override
    public StudentResponse updateStudent(Integer id, StudentRequest studentRequest) {
        StudentEntity entity = StudentMapper.ModelToEntity(studentRequest);
        entity.setId(id);
        return StudentMapper.EntityToModel(studentRepository.save(entity));

    }


    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}

