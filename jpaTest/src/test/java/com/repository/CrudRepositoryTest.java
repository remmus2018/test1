package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shl.entity.Dept;
import com.shl.service.DeptService;



public class CrudRepositoryTest {
	

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
	public void testTwo(){
		/*Thread d1 = new Thread(){
			public void run(){
				Dept dept = null;
    			for (int i = 1; i <1000; i++) {
    				dept = new Dept();
    				dept.setDeptname("test"+i);
    				deptService.save(dept);
    			}
			}
		};
		d1.start();*/
		Dept dept = null;
		for (int i = 1; i <3; i++) {
			dept = new Dept();
			dept.setDeptname("test"+i);
			deptService.save(dept);
		}
		
	}
	
}
