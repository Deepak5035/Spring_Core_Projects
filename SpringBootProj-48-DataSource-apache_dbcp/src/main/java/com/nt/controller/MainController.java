package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.StudentDto;
import com.nt.service.StudentOperationService;
import com.nt.vo.StudentVo;


@Component("controller")
public class MainController {
	
	@Autowired
	private StudentOperationService service;

	public MainController(StudentOperationService service) {
		
		this.service = service;
	}
	public String handleStudent(StudentVo vo)throws Exception {
		StudentDto dto=null;
		String result=null;
		
		//create dto class Object
		dto=new StudentDto();
		dto.setsName(vo.getsName());
		dto.setsAdd(vo.getsAdd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
	
		result=service.register(dto);
		return result;
	}
	
}
