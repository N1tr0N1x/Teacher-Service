package com.eler.ms.course.Teacher.Service.Controllers;

import com.eler.ms.course.Teacher.Service.Models.TeacherAccount;
import com.eler.ms.course.Teacher.Service.Services.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/registerEmptyTeacher/{idTeacher}")
    public TeacherAccount RegisterEmptyTeacher(@PathVariable("idTeacher") int idTeacher){
        return teacherService.CreateEmptyTeacherAccount(idTeacher);
    }
}
