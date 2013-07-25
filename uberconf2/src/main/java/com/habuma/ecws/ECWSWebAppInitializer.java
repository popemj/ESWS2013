package com.habuma.ecws;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ECWSWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}


	
	
	
	
	
	
//	implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext container) throws ServletException {
//		container.addListener(ContextLoaderListener.class);
//		container.setInitParameter("contextClass", 
//				AnnotationConfigWebApplicationContext.class.getName());
//		container.setInitParameter("contextConfigLocation", 
//				RootConfig.class.getName());
//		
//		Dynamic servlet = container.addServlet("dispatcher", 
//				DispatcherServlet.class);
//		servlet.setInitParameter("contextClass", 
//				AnnotationConfigWebApplicationContext.class.getName());
//		servlet.setInitParameter("contextConfigLocation", 
//				WebConfig.class.getName());
//		servlet.addMapping("/");
//		
//	}

}
