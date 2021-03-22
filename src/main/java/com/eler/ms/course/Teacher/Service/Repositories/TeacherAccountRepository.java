package com.eler.ms.course.Teacher.Service.Repositories;

import com.eler.ms.course.Teacher.Service.Models.TeacherAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherAccountRepository extends JpaRepository<TeacherAccount,Integer>{
    
}
