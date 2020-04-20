package com.woniu.springboot.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
	
	private Integer eid;
	private String ename;
	private Date hiredate;
	private Integer did;
	private Dep dep;
	
	public Emp(Integer eid, String ename, Date hiredate, Integer did) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.did = did;
	}
	
	
	
	
}
