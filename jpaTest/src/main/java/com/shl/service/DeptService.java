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
import com.shl.entity.Dept;

@Service
public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Autowired
	private DeptCrudRepository  deptCrudRepository;
	
	
	@Transactional
	public void update(Integer id,String deptname){
		deptRepository.updateDeptName(deptname,id);
	}
	
	@Transactional
	public void save(Dept dept){
		deptCrudRepository.save(dept);
	}
}
