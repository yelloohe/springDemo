package com.test.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
* @author huanghe E-mail:huanghe929@163.com
* @version 创建时间：2018年1月14日 上午12:08:01
* 类说明:MyServletContextListener
*/
@WebListener
public class MyServletContextListener implements ServletContextListener{

	@Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContex contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
         System.out.println("ServletContex contextDestroyed");
    }

}
