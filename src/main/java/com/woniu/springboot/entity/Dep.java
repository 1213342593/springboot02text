package com.woniu.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dep {
	
	private Integer did;
	private String dname;
	private Emp emp;
	
	public Dep(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	
	
}
