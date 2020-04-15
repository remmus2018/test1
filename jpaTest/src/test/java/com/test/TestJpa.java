package com.test;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shl.dao.StudyMapper;
import com.shl.entity.Study;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:spring.xml") 
public class TestJpa {
	
	@Autowired
	private StudyMapper mapper;
	
	@Test
	public void testOne(){
		List<Study> lists = mapper.findAll(); 
		for(Study list : lists){
			System.out.println("=="+list.getId());
		}
		
	}

}
