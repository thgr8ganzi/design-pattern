package org.example.designpattern._02_structural.adapter._02_after;

import org.example.designpattern._02_structural.adapter._02_after.security.LoginHandler;
import org.example.designpattern._02_structural.adapter._02_after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        UserDetailsService userDetailsService = new AccountUserDetailsService(new AccountService());
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("admin", "admin");
        System.out.println(login);
    }
}
