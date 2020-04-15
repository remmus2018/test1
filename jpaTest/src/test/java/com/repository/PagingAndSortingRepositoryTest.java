package com.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.shl.dao.DeptEmp;
import com.shl.dao.DeptPagingAndSortingRepository;
import com.shl.entity.Dept;


public class PagingAndSortingRepositoryTest {
	

	private ApplicationContext ctx = null;
	
	private DeptPagingAndSortingRepository deptPagingAndSortingRepository = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		deptPagingAndSortingRepository = ctx.getBean(DeptPagingAndSortingRepository.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	//分页测试
	@Test
	public void testOne(){
		
		//第0页开始 ，每页显示五条数据， index查询会从1开始查询
		Pageable pageable = new PageRequest(0, 2);
		Page<Dept> page = deptPagingAndSortingRepository.findAll(pageable);
		
		System.out.println("总页数"+page.getTotalPages());
		System.out.println("总记录数"+page.getTotalElements());
		System.out.println("当前第几页"+page.getNumber()+1);
		System.out.println("当前页面集合(包含了哪些对象在当前页)"+page.getContent());
		System.out.println("当前页面的记录数"+page.getNumberOfElements());
	}
	
	//排序
	@Test
	public void testTwo(){
		
		Sort.Order order = new Sort.Order(Sort.Direction.DESC,"id");
		
		Sort sort = new Sort(order);
		
		Pageable pageable = new PageRequest(0, 2,sort);
		Page<Dept> page = deptPagingAndSortingRepository.findAll(pageable);
		
		System.out.println("总页数"+page.getTotalPages());
		System.out.println("总记录数"+page.getTotalElements());
		System.out.println("当前第几页"+page.getNumber()+1);
		System.out.println("当前页面集合(包含了哪些对象在当前页)"+page.getContent());
		System.out.println("当前页面的记录数"+page.getNumberOfElements());
		
	}
}
