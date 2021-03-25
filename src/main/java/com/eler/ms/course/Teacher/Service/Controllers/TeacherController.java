package com.eler.ms.course.Teacher.Service.Controllers;

import java.util.List;

import com.eler.ms.course.Teacher.Service.Models.TeacherAccount;
import com.eler.ms.course.Teacher.Service.Services.TeacherService;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @PostMapping("/saveTeacher")
    @ResponseBody
    public void SaveTeacher(@RequestBody TeacherAccount teacher) {
        teacherService.SaveTeacherAccount(teacher);
    }

    @GetMapping(value = "/teachers")
    @ResponseBody
    public String getAllTeachers() {
        List<TeacherAccount> teachers = teacherService.listAll();
        String data = new Gson().toJson(teachers);
        return data;
    }

    @GetMapping(value = "/delete/{id}")
    @ResponseBody
    public void deleteTeacher(@PathVariable("id") int id) {
        teacherService.delete(id);
    }

    @GetMapping(value = "/getTeacher/{id}")
    @ResponseBody
    public TeacherAccount getModule(@PathVariable("id") int id) {
        return teacherService.getTeacher(id);
    }
}
