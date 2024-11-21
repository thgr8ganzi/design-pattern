package org.example.designpattern._03_behavioral.iterator._01_before;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private String title;
    private String createdDateTime = LocalDateTime.now().toString();

    public Post(String title) {
        this.title = title;
    }
}
