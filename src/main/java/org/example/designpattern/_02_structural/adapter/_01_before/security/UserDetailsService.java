package org.example.designpattern._02_structural.adapter._01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
