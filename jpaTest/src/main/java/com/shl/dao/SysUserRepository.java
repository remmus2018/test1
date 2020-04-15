package com.shl.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shl.entity.SysUser;

public interface SysUserRepository extends PagingAndSortingRepository<SysUser,Integer> {

}
