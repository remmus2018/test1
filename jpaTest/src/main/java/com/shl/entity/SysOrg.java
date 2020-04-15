package com.shl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_org")
public class SysOrg extends SysBasic {
	@Column(length=40,nullable=false)
	private String Org_name;
	@Column(length=40,nullable=false)
	private String Org_code;
	@Column(nullable=false)
	private Integer Parent_org_id;
	@Column(nullable=false)
	private short Org_type;
	@Column(nullable=false)
	private Integer Creator;
	
	public String getOrg_name() {
		return Org_name;
	}
	public void setOrg_name(String org_name) {
		Org_name = org_name;
	}
	public String getOrg_code() {
		return Org_code;
	}
	public void setOrg_code(String org_code) {
		Org_code = org_code;
	}
	public Integer getParent_org_id() {
		return Parent_org_id;
	}
	public void setParent_org_id(Integer parent_org_id) {
		Parent_org_id = parent_org_id;
	}
	public short getOrg_type() {
		return Org_type;
	}
	public void setOrg_type(short org_type) {
		Org_type = org_type;
	}
	public Integer getCreator() {
		return Creator;
	}
	public void setCreator(Integer creator) {
		Creator = creator;
	}
}
