package com.woniu.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.springboot.entity.Dep;
import com.woniu.springboot.entity.Emp;
import com.woniu.springboot.mapper.DepMapper;
import com.woniu.springboot.mapper.EmpMapper;
import com.woniu.springboot.service.EmpService;

import lombok.Data;
@Transactional
@Data
@Service
public class EmpServiceImp implements EmpService{
	
	@Autowired
	DepMapper depMapper;
	
	@Autowired
	EmpMapper empMapper;
	
	//@Transactional注解可以修饰方法和类
	//@Transactional
	/*
	 * @Override public void insertEmp(Emp emp, Dep dep) {
	 * 
	 * depMapper.insertDep(dep); if(true) { throw new RuntimeException(); }
	 * empMapper.insertEmp(emp); }
	 */
	
	@Override
	public List<Emp> selectAllEmps() {
		
		return empMapper.selectAllEmps();
	}
	
	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}
	@Override
	public void deleteEmp(Integer eid) {
		empMapper.deleteEmp(eid);
	}
	@Override
	public Emp selectEmp(Integer eid) {
		Emp emp = empMapper.selectEmp(eid);
		return emp;
	}
	
	@Override
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
		
	}
}
