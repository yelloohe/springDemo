package com.test.base;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
* @author huanghe E-mail:huanghe929@163.com
* @version 创建时间：2018年1月14日 上午12:06:23
* 类说明: MyHttpSessionListener
*/
@WebListener
public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("MyHttpSessionListener sessionCreated");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		 System.out.println("MyHttpSessionListener sessionDestroyed");
	}

}
