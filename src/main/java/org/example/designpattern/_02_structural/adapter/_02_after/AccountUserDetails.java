package org.example.designpattern._02_structural.adapter._02_after;

import org.example.designpattern._02_structural.adapter._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
