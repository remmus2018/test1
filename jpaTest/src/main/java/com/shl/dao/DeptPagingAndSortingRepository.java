package com.shl.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.shl.entity.Dept;

public interface DeptPagingAndSortingRepository extends PagingAndSortingRepository<Dept, Integer> {
}
