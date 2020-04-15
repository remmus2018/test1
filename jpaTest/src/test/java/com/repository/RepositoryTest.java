package com.repository;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.shl.dao.DeptRepository;
import com.shl.entity.Dept;
import com.shl.entity.Emp;
import com.shl.entity.SysOrg;


public class RepositoryTest {
	

	private ApplicationContext ctx = null;
	
	private DeptRepository deptRepository = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		deptRepository = ctx.getBean(DeptRepository.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	
	@Test
	public void testOne(){
	Dept deptName =	deptRepository.findById(1);
		System.out.println("部门名称："+deptName.getDeptname());
	}
	
	@Test
	public void testTwo(){
		Dept deptId =	deptRepository.getMaxDeptId();
		System.out.println("最大部门ID："+deptId.getId());
		System.out.println("最大部门名称："+deptId.getDeptname());
	}
	
	@Test
	public void testThree(){
		Dept deptDe =	deptRepository.queryDemoOne(1, "研发部");
		System.out.println("部门ID："+deptDe.getId());
		System.out.println("部门名称："+deptDe.getDeptname());
	}
	
	@Test
	public void testFour(){
		long count = deptRepository.getCount();
		System.out.println("总记录数："+count);
	}
	
	@Test
	public void testFive(){
		Dept dept = deptRepository.selectById(1);
		System.out.println("===="+dept.getDeptname());
	}
	/*@Test
	public void testSix(){
		Pageable pageable = new PageRequest(0,2, Sort.Direction.DESC,"id");
		Page<Dept> list = deptRepository.findDeptAll(pageable);
		 //查询结果总行数
		  System.out.println(list.getTotalElements());
		  //按照当前分页大小，总页数
		  System.out.println(list.getTotalPages());
		  
		//按照当前页数、分页大小，查出的分页结果集合
		  for (Dept dept: list.getContent()) {
		    System.out.println(dept.getDeptname());
		  }
		
	}*/
	
}
