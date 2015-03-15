package com.tanixu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tanixu.service.TypeService;


@Controller
@RequestMapping("/manage")
public class TypeController {
	
	@Autowired
	private TypeService typeService;

	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	
	@RequestMapping(value="/typeList")
	@ResponseBody
	public Object typeList(
			@RequestParam(required=false) Integer parentId){
		if(parentId!=null){
			return typeService.findByParentId(parentId);
		}
		return typeService.findAll();
	}
	
	@RequestMapping(value="/gradeOne")
	@ResponseBody
	public Object gradeOne(){
		return typeService.findGradeOne();
	}
	
	
}
