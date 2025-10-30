package com.selenium.springMvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;



public class AppDispatcherServlet implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		
		
		DispatcherServlet servlet = new DispatcherServlet(context);
				
		ServletRegistration.Dynamic registeredServlet =
				servletContext.addServlet("dispatcherServlet1", servlet);
		
		registeredServlet.setLoadOnStartup(1);
		registeredServlet.addMapping("/website.com/*");
		
		
	}

}
