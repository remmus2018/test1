package com.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.shl.dao.DeptJpaSpecificationExecutor;
import com.shl.entity.Dept;


public class DeptJpaSpecificationExecutorTest {
	

	private ApplicationContext ctx = null;
	
	private DeptJpaSpecificationExecutor deptJpaSpecificationExecutor = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		deptJpaSpecificationExecutor = ctx.getBean(DeptJpaSpecificationExecutor.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	
	/*
	 * 分页
	 * 排序
	 * 条件查询
	 */
	@Test
	public void testOne(){
		
		Sort.Order order = new Sort.Order(Sort.Direction.ASC,"id");
		
		Sort sort = new Sort(order);
		
		Pageable pageable = new PageRequest(0, 2,sort);
		
		Specification<Dept> specification = new Specification<Dept>() {
			public Predicate toPredicate(   Root<Dept> root,
										    CriteriaQuery<?> query, 
											CriteriaBuilder cb) {
			
				//取到id的值   
			  Path path = root.get("id");
			  //id的值大于2
			  return cb.gt(path, 2);
			  
			}
		};
		
		Page<Dept> page = deptJpaSpecificationExecutor.findAll(specification,pageable);
		System.out.println("总页数"+page.getTotalPages());
		System.out.println("总记录数"+page.getTotalElements());
		System.out.println("当前第几页"+page.getNumber()+1);
		System.out.println("当前页面集合(包含了哪些对象在当前页)"+page.getContent());
		System.out.println("当前页面的记录数"+page.getNumberOfElements());
	}
	
	
}
