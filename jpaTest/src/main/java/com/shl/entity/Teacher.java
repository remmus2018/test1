package com.shl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="teacher")
public class Teacher {
	 @Id
	//主键生成策略很多，具体用什么方式的都可以
	//生成uuid
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
	
	 //IDENTITY：主键由数据库自动生成（主要是自动增长型）  AUTO：主键由程序控制。
	//  自动增长 mysql sqlserver 
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	// @GeneratedValue(strategy=GenerationType.SEQUENCE)  oracle
	
	private String id;
    
	//映射到数据库的字段设置长度，默认值，类型，字段注释(数据库字段注释)
	@Column(name="teancherName",nullable=false,columnDefinition="date COMMENT'教师名'")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="tid")
	private Teacher ScId;
	
	private String hobby;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getScId() {
		return ScId;
	}
	public void setScId(Teacher scId) {
		ScId = scId;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
