package org.example.designpattern._02_structural.adapter._02_after;

import lombok.Data;
import org.example.designpattern._02_structural.adapter._02_after.security.UserDetails;

@Data
public class Account implements UserDetails {
    private String name;
    private String password;
    private String email;

    @Override
    public String getUsername() {
        return this.name;
    }
}
