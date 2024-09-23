package org.example.designpattern.behavioral.chain_of_responsibility._01_before;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handle(request);
    }
}
