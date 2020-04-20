package com.woniu.springboot;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniu.springboot.entity.Dep;
import com.woniu.springboot.entity.Emp;
import com.woniu.springboot.mapper.DepMapper;
import com.woniu.springboot.mapper.EmpMapper;
import com.woniu.springboot.service.EmpService;

@SpringBootTest
class Springboot03ApplicationTests {
	
	@Autowired
	DepMapper depMapper;
	
	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	EmpService empService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void test01() {
		//Dep dep2 = new Dep(2,"dep002");
		//depMapper.insertDep(dep2);
		
		List<Dep> deps = depMapper.selectAllDeps();
		System.out.println(deps);
	}
	
	@Test
	public void test02() {
		//Emp emp = new Emp(1, "张三", new Date(), 1);
		//empMapper.insertEmp(emp);
		List<Emp> emps = empMapper.selectAllEmps();
		System.out.println(emps);
	}
	
	@Test
	public void test03() {
		Dep dep = new Dep(3,"dep002");
		Emp emp = new Emp(2, "张三", new Date(), 3);
		//empService.insertEmp(emp, dep);
	}
}
