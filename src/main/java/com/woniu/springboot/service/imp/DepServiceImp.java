package com.woniu.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.springboot.entity.Dep;
import com.woniu.springboot.mapper.DepMapper;
import com.woniu.springboot.mapper.EmpMapper;
import com.woniu.springboot.service.DepService;

import lombok.Data;

@Data
@Service
public class DepServiceImp implements DepService{
	@Autowired
	private DepMapper depMapper;
	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public void insertDep(Dep dep) {
		depMapper.insertDep(dep);
	}
	
	@Override
	public List<Dep> selectAllDeps() {
		
		return depMapper.selectAllDeps();
	}

}
