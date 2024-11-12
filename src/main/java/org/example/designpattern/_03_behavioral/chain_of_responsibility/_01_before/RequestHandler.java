package org.example.designpattern._03_behavioral.chain_of_responsibility._01_before;

public class RequestHandler {
    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
