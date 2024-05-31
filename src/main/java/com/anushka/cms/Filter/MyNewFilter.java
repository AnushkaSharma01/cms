package com.anushka.cms.Filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component

public class MyNewFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("The New Filter is called ..");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
