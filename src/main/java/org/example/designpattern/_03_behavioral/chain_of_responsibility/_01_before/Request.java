package org.example.designpattern._03_behavioral.chain_of_responsibility._01_before;

import lombok.Getter;

@Getter
public class Request {
    private final String body;

    public Request(String body) {
        this.body = body;
    }

}
