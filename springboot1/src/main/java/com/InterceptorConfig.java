package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.oaec.interceptor.LoginInterceptor;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	/**
	 * 重写添加拦截器的方法：将容器中已存在的对象标记为拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor).
		addPathPatterns("/**").excludePathPatterns("/test.do","/findUsers.do");
	}
	
	
	

}
