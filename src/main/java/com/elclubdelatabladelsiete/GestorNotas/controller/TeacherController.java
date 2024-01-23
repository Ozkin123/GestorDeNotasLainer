package com.elclubdelatabladelsiete.GestorNotas.controller;

import com.elclubdelatabladelsiete.GestorNotas.model.request.TeacherRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.TeacherResponse;
import com.elclubdelatabladelsiete.GestorNotas.service.TeacherService;
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

    @GetMapping(value = "/getteacherbyid/{id}")
    public TeacherResponse getTeacherById(@PathVariable Integer id){
        return teacherService.getTeacherById(id);
    }

    @PostMapping(value="/updateteacher/{id}")
    public TeacherResponse updateTeacherById(@PathVariable Integer id,@RequestBody TeacherRequest teacherRequest){
        return teacherService.updateTeacher(id,teacherRequest);
    }

    @DeleteMapping(value = "/deleteTeacher/{id}")
    public void deleteTeacherById(@PathVariable Integer id){
        teacherService.deleteTeacherById(id);
    }



}
