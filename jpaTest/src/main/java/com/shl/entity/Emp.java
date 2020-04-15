package com.shl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="emp")
public class Emp {
	@TableGenerator(name="id_generator",  //生成器名称
		    table="id_generator", //生成器使用的表
		    pkColumnName="PK_NAME", //表中对应的字段名
		    pkColumnValue="emp_id", //上述字段的值
		    valueColumnName="PK_VALUE", //值 
		    //根据上述三个属性，就可以定位到表中的PK_VALUE的值，如：1，10，100
		    allocationSize=5)//表示主键一次增加10
    @GeneratedValue(strategy=GenerationType.TABLE,generator="id_generator")//这里的生成器和上面的生成器名称对应
	@Id
	private Integer empid;
	private String empname;
	private Integer dpId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="deptid")
	private Dept dept;
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getDpId() {
		return dpId;
	}
	public void setDpId(Integer dpId) {
		this.dpId = dpId;
	}
}
