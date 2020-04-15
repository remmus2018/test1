package com.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shl.service.DeptService;

public class DeptServiceTest {
	
	private ApplicationContext ctx = null;
	
	private DeptService deptService = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		deptService = ctx.getBean(DeptService.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	@Test
	public void update(){
		deptService.update(1, "dept");
	}

}
