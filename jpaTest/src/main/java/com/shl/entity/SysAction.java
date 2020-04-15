package com.shl.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="sys_action")
public class SysAction extends SysBasic{
	@Column(length=50,nullable=false)
	private String action_code;
	@Column(length=20,nullable=false)
	private String action_name;
	
	@Column(length=200)
	private String action_url;
	@Column(length=200)
	private String action_ico;

	@Column(nullable=false)
	private short Action_type;
	@Column(nullable=false)
	private Integer Parent_action_id;
	@Column(nullable=false)
	private Integer Creator;
	
	//如果使用mappedBy的一边即为被控方，那么，在另一边（主控方）就得使用@JoinTable对中间表、以及指向这两张表的关系（外键）写清楚
	//mappedBy 属性定义了此类为双向关系的维护端，注意：mappedBy 属性的值为此关系的另一端的属性名。
	@ManyToMany(mappedBy="sysAction")
	private Set<SysRole> sysRole;
	
	public String getAction_code() {
		return action_code;
	}
	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}
	public String getAction_name() {
		return action_name;
	}
	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}
	public String getAction_url() {
		return action_url;
	}
	public void setAction_url(String action_url) {
		this.action_url = action_url;
	}
	public String getAction_ico() {
		return action_ico;
	}
	public void setAction_ico(String action_ico) {
		this.action_ico = action_ico;
	}
	public short getAction_type() {
		return Action_type;
	}
	public void setAction_type(short action_type) {
		Action_type = action_type;
	}
	public Integer getParent_action_id() {
		return Parent_action_id;
	}
	public void setParent_action_id(Integer parent_action_id) {
		Parent_action_id = parent_action_id;
	}
	public Integer getCreator() {
		return Creator;
	}
	public void setCreator(Integer creator) {
		Creator = creator;
	}
	public Set<SysRole> getSysRole() {
		return sysRole;
	}
	public void setSysRole(Set<SysRole> sysRole) {
		this.sysRole = sysRole;
	}
}
