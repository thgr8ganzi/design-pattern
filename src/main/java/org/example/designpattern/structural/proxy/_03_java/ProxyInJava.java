package org.example.designpattern.structural.proxy._03_java;

import org.example.designpattern.structural.proxy._02_after.GameService;
import org.example.designpattern.structural.proxy._02_after.DefaultGameService;
import org.example.designpattern.structural.proxy._02_after.GameServiceProxy;

import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }
    private void dynamicProxy() {
        GameService gameServiceProxy = gameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService gameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class []{GameService.class},(proxy, method, args) -> {
                    System.out.println("Proxy before method call");
                    method.invoke(target, args);
                    System.out.println("Proxy after method call");
                    return null;
                });
    }
}
