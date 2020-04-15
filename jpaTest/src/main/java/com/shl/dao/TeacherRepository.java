package com.shl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shl.entity.Teacher;

public interface TeacherRepository 
extends  JpaRepository<Teacher,String>{

}
