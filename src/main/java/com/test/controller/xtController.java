package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.test.facade.ReturnMessage;

/**
* @author huanghe E-mail:huanghe929@163.com
* @version 创建时间：2018年1月11日 下午9:36:46
* 类说明:
*/
@RestController
@RequestMapping("/demo")
public class xtController {

	@RequestMapping("/login")
	public String login(){
		return "登录。。。11126662232官方后宫番";
	}
		
	
	@RequestMapping("/test")
	public ReturnMessage test(){
		ReturnMessage rm = new ReturnMessage();
		rm.setStatus("0");
		rm.setMessage("-----信息");
		rm.setValue("测试");
		return rm;
	}
	
	@RequestMapping("/getFastJson")
	public String getFastJson(){
		ReturnMessage rm = new ReturnMessage();
		rm.setStatus("0");
		rm.setMessage("返回的是json的String");
		rm.setValue("测试sssssssss");
		return JSONObject.toJSONString(rm);
	}
	
	@RequestMapping("/exception")
	public int exception(){		
		int a = 100/0;
		return a;
	}
	
}
