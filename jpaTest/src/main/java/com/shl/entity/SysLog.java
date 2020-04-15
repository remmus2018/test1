package com.shl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_log")
public class SysLog extends SysBasic {
	@Column(nullable=false)
	private short log_type;
	@Column(length=20,nullable=false)
	private String Log_module;
	@Column(length=1000)
	private String Log_content;
	@Column(length=30)
	private String Ip_addr;
	private Integer Creator;
	
	public short getLog_type() {
		return log_type;
	}
	public void setLog_type(short log_type) {
		this.log_type = log_type;
	}
	public String getLog_module() {
		return Log_module;
	}
	public void setLog_module(String log_module) {
		Log_module = log_module;
	}
	
	public String getLog_content() {
		return Log_content;
	}
	public void setLog_content(String log_content) {
		Log_content = log_content;
	}
	public String getIp_addr() {
		return Ip_addr;
	}
	public void setIp_addr(String ip_addr) {
		Ip_addr = ip_addr;
	}
	
	
	public Integer getCreator() {
		return Creator;
	}
	public void setCreator(Integer creator) {
		Creator = creator;
	}
}
