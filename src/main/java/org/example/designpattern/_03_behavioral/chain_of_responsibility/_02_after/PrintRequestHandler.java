package org.example.designpattern._03_behavioral.chain_of_responsibility._02_after;

import org.example.designpattern._03_behavioral.chain_of_responsibility._01_before.Request;

public class PrintRequestHandler extends RequestHandler {
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
