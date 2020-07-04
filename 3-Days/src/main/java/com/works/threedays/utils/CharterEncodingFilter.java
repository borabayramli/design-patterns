package com.works.threedays.utils;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("characterEncoding")
@Order(1)
public class CharterEncodingFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Server Call");
	}
	
	boolean rStatu = false;
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		req.setCharacterEncoding("UTF8");
		res.setCharacterEncoding("UTF8");
		
		// Request Data
		Map<String,String[]> m = req.getParameterMap();
		m.forEach( (k,v) -> {
			System.out.println( "Key : " + k + " Val : " + v[0] );
			boolean statu = filter(v[0]);
			if (statu) {
				System.out.println("Hata var");
				// Fail
				//System.exit(0);
				String ip = req.getRemoteAddr();
				System.out.println("IP : " + ip);
				rStatu = true;
			}
			
		});
		
		chain.doFilter(req, res);

		
	}

	@Override
	public void destroy() {
		System.out.println("Server Down");
	}
	
	
	public boolean filter( String item ) {
		boolean statu = false;
		String[] arr = { "script", "html", "table", "php", "jsp", "js" };
		for (String arrItem : arr) {
			if (item.contains(arrItem)) {
				statu = true;
				break;
			}
		}
		return statu;
	}
	
	
}
