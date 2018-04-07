package ua.logos.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.setServletContext(servletContext);
		webContext.setConfigLocation("ua.logos.config");
		servletContext.addListener(new ContextLoaderListener(webContext));
		
		ServletRegistration.Dynamic reg = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webContext));
		reg.setLoadOnStartup(1);
		reg.addMapping("/");
	}

}
