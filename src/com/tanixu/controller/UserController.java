package com.tanixu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tanixu.bean.User;
import com.tanixu.enumeration.UserSituation;
import com.tanixu.service.UserService;
import com.tanixu.util.Constant.UserSituationEnum;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/checkUser")
	@ResponseBody
	public Object checkUser(HttpServletResponse response,
			@RequestParam(required=false) String useracc,
			@RequestParam(required=false) String userpass) throws IOException {
		System.out.println("checkUser:useracc-"+useracc+",userpass-"+userpass);
		if(useracc==null) 
			return new UserSituation(UserSituationEnum.NO_ACCOUNT.getCode(),UserSituationEnum.NO_ACCOUNT.getValue());
		if(userpass==null) 
			return UserSituationEnum.NO_PASSWORD.getValue();
		User user = userService.findUserByUserAcc(useracc);
		return user;
	}
	
	@RequestMapping(value="/index")
	public String index(){
		
		return "index";
	}
}
