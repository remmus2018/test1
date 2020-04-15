package com.shl.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.shl.entity.Dept;

public interface DeptJpaSpecificationExecutor
      extends JpaRepository<Dept, Integer>,JpaSpecificationExecutor<Dept> {
}
