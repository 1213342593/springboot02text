package com.woniu.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.springboot.entity.Dep;
import com.woniu.springboot.entity.Emp;
import com.woniu.springboot.service.DepService;
import com.woniu.springboot.service.EmpService;

//相当于在每个方法上添加@ResponseBody,所有的处理器方法返回都是JSON
//@RestController
@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@Autowired
	private DepService depService;
	
	/*没有用
	 * @RequestMapping("/emp") public String insertEmp(Emp emp,Model model) {
	 * System.out.println("执行添加方法"); empService.insertEmp(emp); return "执行添加方法"; }
	 */
	
	//跳转到添加页面
	@RequestMapping("/emp/add")
	public String insertEmp(Model model) {
		System.out.println("执行添加的跳转方法");
		List<Dep> deps = depService.selectAllDeps();
		model.addAttribute("deps", deps);
		return "empInsert";
	}
	
	//添加数据,并返回首页
	@RequestMapping("/emp/insert")
	public String insertEmp(Emp emp) {
		System.out.println("执行添加的插入方法");
		System.out.println(emp);
		empService.insertEmp(emp);
		return "redirect:/";
	}
	
	//删除
	@RequestMapping("/emp/delete/{eid}")
	public String deleteEmp(@PathVariable("eid") Integer eid) {
		System.out.println("执行删除:"+eid);
		empService.deleteEmp(eid);
		return "redirect:/";
	}
	
	//执行更新之前的页面跳转
	@RequestMapping("/emp/update/{eid}")
	public String updateEmp(@PathVariable("eid") Integer eid, Model model) {
		System.out.println("执行跳转:"+eid);
		//查询所有的部门信息
		List<Dep> deps = depService.selectAllDeps();
		model.addAttribute("deps", deps);
		//获取该员工的信息
		Emp emp = empService.selectEmp(eid);
		model.addAttribute("emp", emp);
		return "empUpdate";
	}
	
	//执行更新的数据库修改
		@RequestMapping("/emp/update")
		public String updateEmp(Emp emp) {
			System.out.println("要修改的是:"+emp);
			empService.updateEmp(emp);
			
			return "redirect:/";
		}
	
	//显示所有的员工信息
	@ResponseBody
	@RequestMapping("/emps")
	public List<Emp> selectAllEmps() {
		return  empService.selectAllEmps();
	}
}
