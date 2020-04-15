package com.shl.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
//系统用户
@Entity
@Table(name="sys_user")
public class SysUser extends SysBasic {
	@Column(length=30,nullable=false)
	private String User_name;
	@Column(length=64,nullable=false)
	private String password;
	@Column(nullable=false)
	private Integer orgid;
	@Column(length=20)
	private String Real_name;
	@Column(length=20)
	private String Employee_code;
	@Column(nullable=false)
	private Integer Creator;
	@Column(length=100)
	private String Head_url;
	@ManyToMany(mappedBy="sysUser")
	private Set<SysRole> sysRole;
	
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getOrgid() {
		return orgid;
	}
	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}
	public String getReal_name() {
		return Real_name;
	}
	public void setReal_name(String real_name) {
		Real_name = real_name;
	}
	public String getEmployee_code() {
		return Employee_code;
	}
	public void setEmployee_code(String employee_code) {
		Employee_code = employee_code;
	}
	public Integer getCreator() {
		return Creator;
	}
	public void setCreator(Integer creator) {
		Creator = creator;
	}
	public String getHead_url() {
		return Head_url;
	}
	public void setHead_url(String head_url) {
		Head_url = head_url;
	}
	public Set<SysRole> getSysRole() {
		return sysRole;
	}
	public void setSysRole(Set<SysRole> sysRole) {
		this.sysRole = sysRole;
	}
}
