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
import com.shl.service.DeptService;
import com.shl.service.SysUserService;


public class SysUserRepositoryTest {
	

	private ApplicationContext ctx = null;
	
	private SysUserService sysUserService = null;
	
	@Before
	public void setup(){
		ctx = new ClassPathXmlApplicationContext("spring-new.xml");
		sysUserService = ctx.getBean(SysUserService.class);
		System.out.println("setup");
	}
	
	@After
	public void tearDown(){
		ctx=null;
		System.out.println("tearDown");
	}
	
	@Test
	public void testOne(){
		SysUser sysUser = new SysUser();
		sysUser.setCreatetime(new Date());
		sysUser.setStatus((short) 1);
		sysUser.setCreator(11);
		sysUser.setEmployee_code("111");
		sysUser.setUser_name("ert");
		sysUser.setHead_url("345");
		sysUser.setOrgid(102);
		sysUser.setPassword("222");
		sysUser.setReal_name("ttt");
		sysUserService.saveSysUser(sysUser);
	}
}
