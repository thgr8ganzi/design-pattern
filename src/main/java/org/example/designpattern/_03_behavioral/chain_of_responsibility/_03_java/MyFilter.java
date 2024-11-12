package org.example.designpattern._03_behavioral.chain_of_responsibility._03_java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter - doFilter - before");
        chain.doFilter(request, response);
        System.out.println("MyFilter - doFilter - after");
    }
}
