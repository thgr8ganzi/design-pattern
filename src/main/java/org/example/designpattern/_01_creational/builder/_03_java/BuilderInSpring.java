package org.example.designpattern._01_creational.builder._03_java;

import org.springframework.web.util.UriComponentsBuilder;

public class BuilderInSpring {
    public static void main(String[] args) {
        UriComponentsBuilder builder = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.example.com")
                .path("/user")
                .queryParam("name", "John")
                .queryParam("age", 30);
        System.out.println(builder.toUriString());
    }
}
