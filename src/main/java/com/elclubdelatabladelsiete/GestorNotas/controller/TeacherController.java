package com.elclubdelatabladelsiete.GestorNotas.controller;

import com.elclubdelatabladelsiete.GestorNotas.entity.TeacherEntity;
import com.elclubdelatabladelsiete.GestorNotas.model.request.TeacherRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.TeacherResponse;
import com.elclubdelatabladelsiete.GestorNotas.service.TeacherService;
import com.elclubdelatabladelsiete.GestorNotas.service.TeacherServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @PostMapping(value = "/addTeacher")
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherResponse addTeacher(@RequestBody TeacherRequest teacherRequest){
        return teacherService.addTeacher(teacherRequest);
    }


}
