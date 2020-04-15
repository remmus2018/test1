package com.shl.dao;

import javax.transaction.Transactional;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.shl.entity.Dept;

public interface DeptRepository extends  JpaRepository<Dept, Integer>,JpaSpecificationExecutor<Dept> {
	public Dept findById(Integer id);
	
	//Dept 对应的是实体类
	@Query("select d from Dept d where id=(select max(id) from Dept)")
	public Dept getMaxDeptId();
	
	//like %?1%
	@Query("select d from Dept d where d.id =?1 and d.deptname =?2")
	public Dept queryDemoOne(Integer id,String deptname);
	
	@Query("select d from Dept d where d.id =:name and d.deptname =:deptname")
	public Dept queryDemoOne1(@Param("id")Integer id,@Param("deptname")String deptname);
	
	@Query(nativeQuery=true,value="select count(*) from dept")
	public long getCount();
	
	//自定sql语句时update需添加
	
	@Modifying
	@Query("update Dept o set o.deptname =?1 where o.id =?2")
	public void updateDeptName(String deptname,Integer id);
	
	@Query(value="select * from dept where id =?1",nativeQuery=true)
	public Dept selectById(Integer id);
	
	//@Query(value="select * from dept d left join emp e on d.id = e.deptid",nativeQuery=true)
	//Page<Dept> findDeptAll(Pageable pageable);
}
