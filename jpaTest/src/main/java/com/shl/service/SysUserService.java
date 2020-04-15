package com.shl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shl.dao.SysUserRepository;
import com.shl.entity.SysUser;

@Service
public class SysUserService {
	
	@Autowired
	private SysUserRepository sysUserRepository;
	@Transactional
	public void saveSysUser(SysUser sysUser){
		sysUserRepository.save(sysUser);
	}

}
