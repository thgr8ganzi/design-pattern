package org.example.designpattern.behavioral.iterator._01_before;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }
    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
