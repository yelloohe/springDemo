package com.test.facade;
/**
* @author huanghe E-mail:huanghe929@163.com
* @version 创建时间：2018年1月11日 下午10:04:41
* 类说明:
*/
public class ReturnMessage {
	private String status = "1";
	
	private String message = "";
	
	private Object value;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
