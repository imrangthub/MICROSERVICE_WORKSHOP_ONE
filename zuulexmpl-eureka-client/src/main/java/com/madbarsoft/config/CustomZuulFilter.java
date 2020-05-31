package com.madbarsoft.config;

import org.springframework.context.annotation.Configuration;
import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class CustomZuulFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(CustomZuulFilter.class);

	  @Override
	  public String filterType() {
		  System.out.println("Pre filter");
	    return "pre";
	  }

	  @Override
	  public int filterOrder() {
	    return 1;
	  }

	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }

	  @Override
	  public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();

	    System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
	    
	    log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

	    return null;
	  }
	  
}