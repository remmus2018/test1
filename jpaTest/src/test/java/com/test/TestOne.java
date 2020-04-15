package com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shl.entity.Dept;


public class TestOne  {
	

  

	private ApplicationContext ctx = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	@Test
	public void testTwo(){
		
	}
	

	@Test
	public void testThree(){
	   
	}
    
}
