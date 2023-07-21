package com.elclubdelatabladelsiete.GestorNotas.controller;

import com.elclubdelatabladelsiete.GestorNotas.model.request.StudentRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.StudentResponse;
import com.elclubdelatabladelsiete.GestorNotas.service.StudentService;
import com.elclubdelatabladelsiete.GestorNotas.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudenController {

    @Resource
    StudentService studentService;

    @PostMapping( value = "/create")
    public StudentResponse createStuden(@Validated @RequestBody StudentRequest studentRequest){
       return studentService.addStudent(studentRequest);
    }

    @GetMapping( value = "/{id}/getById")
    public StudentResponse readStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @PutMapping ( value = "/{id}/update")
    public StudentResponse updateStudent(@PathVariable Integer id ,@RequestBody StudentRequest studentRequest){
        return studentService.updateStudent(id,studentRequest);
    }

    @DeleteMapping ( value = "/{id}/delete")
    public void updateStudent(@PathVariable Integer id){
         studentService.deleteStudent(id);
    }
}
