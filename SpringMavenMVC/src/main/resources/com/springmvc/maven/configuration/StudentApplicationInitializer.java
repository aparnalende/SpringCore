package com.springmvc.maven.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class StudentApplicationInitializer implements WebApplicationInitializer{
	public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(StudentApplicationConfiguration.class);
		ctx.setServletContext(container);
		ServletRegistration.Dynamic servlet=container.addServlet("dispatcher", new DispatcherServlet(ctx));
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
