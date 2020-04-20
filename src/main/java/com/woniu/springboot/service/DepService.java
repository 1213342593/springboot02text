package com.woniu.springboot.service;

import java.util.List;

import com.woniu.springboot.entity.Dep;

public interface DepService {

	public void insertDep(Dep dep);
	
	public List<Dep> selectAllDeps();
}
