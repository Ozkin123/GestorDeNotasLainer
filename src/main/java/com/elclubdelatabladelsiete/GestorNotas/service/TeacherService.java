package com.elclubdelatabladelsiete.GestorNotas.service;

import com.elclubdelatabladelsiete.GestorNotas.model.request.TeacherRequest;
import com.elclubdelatabladelsiete.GestorNotas.model.respose.TeacherResponse;

public interface TeacherService {
    TeacherResponse addTeacher(TeacherRequest teacherRequest);
    TeacherResponse updateTeacher(Integer id,TeacherRequest teacherRequest);
    TeacherResponse getTeacherById(Integer id);
    void deleteTeacherById(Integer id);

}
