package com.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shl.entity.Dept;
import com.shl.entity.SysUser;
import com.shl.entity.Teacher;
import com.shl.service.DeptService;
import com.shl.service.SysUserService;
import com.shl.service.TeacherService;


public class TeacherRepositoryTest {
	

	private ApplicationContext ctx = null;
	
	private TeacherService teacherService = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		teacherService = ctx.getBean(TeacherService.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	@Test
	public void testOne(){
		Teacher t = new Teacher();
		t.setName("zhang");
		teacherService.save(t);
	}
}
