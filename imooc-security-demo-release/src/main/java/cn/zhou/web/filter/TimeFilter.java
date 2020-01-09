package cn.zhou.web.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

@Component
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        Long time = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter 耗时："+(System.currentTimeMillis()-time));
    }

    @Override
    public void destroy() {
        System.out.println("filter destory");

    }
}
