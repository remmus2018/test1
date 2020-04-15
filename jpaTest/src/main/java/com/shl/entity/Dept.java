package com.shl.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="dept")
public class Dept {
	
	@TableGenerator(name="id_generator",  //生成器名称
    table="id_generator", //生成器使用的表
    pkColumnName="PK_NAME", //表中对应的字段名
    pkColumnValue="dept_id", //上述字段的值
    valueColumnName="PK_VALUE", //值 
    //根据上述三个属性，就可以定位到表中的PK_VALUE的值，如：1，10，100
    allocationSize=5)//表示主键一次增加10
    @GeneratedValue(strategy=GenerationType.TABLE,generator="id_generator")//这里的生成器和上面的生成器名称对应
	@Id
	private Integer id;
	
	private Integer IdCard;
	
	private String deptname;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="deptid")
	private Set<Emp> emp;
	
	public Set<Emp> getEmp() {
		return emp;
	}
	public void setEmp(Set<Emp> emp) {
		this.emp = emp;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdCard() {
		return IdCard;
	}
	public void setIdCard(Integer idCard) {
		IdCard = idCard;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptname=" + deptname + "]";
	}
	
}
