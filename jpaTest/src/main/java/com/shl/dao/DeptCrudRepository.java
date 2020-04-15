package com.shl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shl.entity.Dept;

public interface DeptCrudRepository extends JpaRepository<Dept, Integer>{

}
