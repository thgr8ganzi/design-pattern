package org.example.designpattern._02_structural.adapter._02_after;

import org.example.designpattern._02_structural.adapter._02_after.security.UserDetails;
import org.example.designpattern._02_structural.adapter._02_after.security.UserDetailsService;

public class AccountService implements UserDetailsService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }
    public void createNewAccount(Account account) {}
    public void updateAccount(Account account) {}

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
