/**
 * 
 */
package com.westat.navigator.user.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author yandagudita_s
 *
 */
public class EnableCORSRequest extends HandlerInterceptorAdapter {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, PATCH, DELETE");
		response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,content-type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		
		return super.preHandle(request, response,
				handler);
	}
}
