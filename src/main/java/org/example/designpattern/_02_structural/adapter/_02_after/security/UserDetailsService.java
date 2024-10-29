package org.example.designpattern._02_structural.adapter._02_after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
