package com.elclubdelatabladelsiete.GestorNotas.controller;

import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;
import com.elclubdelatabladelsiete.GestorNotas.service.StudentService;
import com.elclubdelatabladelsiete.GestorNotas.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudenController {

    @Resource
    StudentService studentService;

    @PostMapping( value = "/create")
    public StudentResponse createStuden(@RequestBody StudentRequest studentRequest){
       return studentService.addStudent(studentRequest);
    }
}
