package com.shl.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shl.dao.DeptCrudRepository;
import com.shl.dao.DeptRepository;
import com.shl.dao.TeacherRepository;
import com.shl.entity.Dept;
import com.shl.entity.Teacher;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Transactional
	public void save(Teacher teacher){
		teacherRepository.save(teacher);
	}
}
