package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

	 Logger logger= LoggerFactory.getLogger(EmpController.class);

	@Autowired
	private EmpService empService;

	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest request){
		List<Emp> list = empService.queryAll();
		request.setAttribute("emps", list);
		return "emplist";
	}
	@RequestMapping("/delete")
	public String delete(Emp emp){
		empService.delete(emp);
		return "redirect:/emp/findAll";
	}
	@RequestMapping("/save")
	public String save(Emp emp){
		empService.insert(emp);
		return "redirect:/emp/findAll";
	}
	@RequestMapping("/update")
	public String update(Emp emp){
		empService.update(emp);
		return "redirect:/emp/findAll";
	}
}
