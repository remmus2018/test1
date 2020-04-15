package com.shl.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="sys_role")
public class SysRole extends SysBasic {
	@Column(length=50,nullable=false)
	private String role_code;
	@Column(length=20,nullable=false)
	private String role_name;
	@Column(length=200)
	private String action_ico;
	@Column(nullable=false)
	private short role_type ;
	@Column(nullable=false)
	private Integer Creator ;
	
	//joinColumns主操作表的中间表列   inverseJoinColumns是副操作表的中间表列
	//属性referencedColumnName标注的是所关联表中的字段名，若不指定则使用的所关联表的主键字段名作为外键。 
	@ManyToMany
	@JoinTable(name="Sys_role_action",joinColumns={@JoinColumn(name="Role_id")},
	inverseJoinColumns={@JoinColumn(name="Action_id")})
	private Set<SysAction> sysAction;
	
	@ManyToMany
	@JoinTable(name="Sys_role_user",joinColumns={@JoinColumn(name="Role_id")},
	inverseJoinColumns={@JoinColumn(name="user_id")})
	private Set<SysUser> sysUser;
	public String getRole_code() {
		return role_code;
	}
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}
	
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getAction_ico() {
		return action_ico;
	}
	public void setAction_ico(String action_ico) {
		this.action_ico = action_ico;
	}
	public short getRole_type() {
		return role_type;
	}
	public void setRole_type(short role_type) {
		this.role_type = role_type;
	}
	public Integer getCreator() {
		return Creator;
	}
	public void setCreator(Integer creator) {
		Creator = creator;
	}
	
	public Set<SysUser> getSysUser() {
		return sysUser;
	}
	public void setSysUser(Set<SysUser> sysUser) {
		this.sysUser = sysUser;
	}
	public Set<SysAction> getSysAction() {
		return sysAction;
	}
	public void setSysAction(Set<SysAction> sysAction) {
		this.sysAction = sysAction;
	}
}
