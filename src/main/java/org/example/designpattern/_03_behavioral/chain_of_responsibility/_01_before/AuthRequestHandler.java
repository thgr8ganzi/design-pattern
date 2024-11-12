package org.example.designpattern._03_behavioral.chain_of_responsibility._01_before;

public class AuthRequestHandler extends RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("인증 인가 처리");
        super.handle(request);
    }
}
