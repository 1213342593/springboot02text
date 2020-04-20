package com.woniu.springboot.service;

import java.util.List;

import com.woniu.springboot.entity.Dep;
import com.woniu.springboot.entity.Emp;

public interface EmpService {
	
	//public void insertEmp(Emp emp, Dep dep);
	
	public void insertEmp(Emp emp);
	
	public List<Emp> selectAllEmps();

	public void deleteEmp(Integer eid);

	public Emp selectEmp(Integer eid);

	public void updateEmp(Emp emp);

}
