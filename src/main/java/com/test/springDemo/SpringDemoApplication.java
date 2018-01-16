package com.test.springDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.test.base.MyFilter;


@SpringBootApplication
@ComponentScan("com.test.*")//能扫描到的包
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);	
	}
	
	/**
	 * 过滤器
	 * @return
	 */
	/*@Bean
	public FilterRegistrationBean filterRegistrationBean() {
	   FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	   MyFilter myFilter = new MyFilter();
	   registrationBean.setFilter(myFilter);
	   List<String> urlPatterns = new ArrayList<String>();
	   urlPatterns.add("/*");
	   registrationBean.setUrlPatterns(urlPatterns);
	   return registrationBean;
	}*/
}
