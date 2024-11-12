package org.example.designpattern._03_behavioral.chain_of_responsibility._03_java;

import jakarta.servlet.*;
import java.io.IOException;

public class CoRInJava {
    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                System.out.println("doFilter - before");
                // TODO: Implement the filter logic
                filterChain.doFilter(servletRequest, servletResponse);
                // TODO: Implement the filter logic
            }
        };
    }
}
