package com.woniu.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.woniu.springboot.entity.Emp;

//生成接口的实现类,须在每个接口上添加
//优化方法,在主类上添加注解@MapperScan
//例如@MapperScan("com.woniu.springboot.mapper")
@Mapper
public interface EmpMapper {
	
	public void insertEmp(Emp emp);
	
	public List<Emp> selectAllEmps();

	public void deleteEmp(Integer eid);

	public Emp selectEmp(Integer eid);

	public void updateEmp(Emp emp);

}
