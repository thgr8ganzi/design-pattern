package org.example.designpattern.behavioral.chain_of_responsibility._02_after;

import org.example.designpattern.behavioral.chain_of_responsibility._01_before.Request;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
