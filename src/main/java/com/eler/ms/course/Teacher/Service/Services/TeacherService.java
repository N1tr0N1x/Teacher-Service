package com.eler.ms.course.Teacher.Service.Services;

import com.eler.ms.course.Teacher.Service.Models.TeacherAccount;
import com.eler.ms.course.Teacher.Service.Repositories.TeacherAccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    
    @Autowired
    TeacherAccountRepository teacherAccRepository;

    public TeacherAccount CreateEmptyTeacherAccount(int idTeacher) {
        TeacherAccount teacher = new TeacherAccount(idTeacher);
        teacherAccRepository.save(teacher);
        return teacher;
    }

    public TeacherAccount CreateTeacherAccount(int idTeacher, String email, String firstName, String lastName){
        TeacherAccount teacher = new TeacherAccount(idTeacher,email,firstName,lastName);
        teacherAccRepository.save(teacher);
        return teacher;
    }
}
