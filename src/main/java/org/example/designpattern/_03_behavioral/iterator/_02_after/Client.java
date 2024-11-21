package org.example.designpattern._03_behavioral.iterator._02_after;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("Post 1");
        board.addPost("Post 2");
        board.addPost("Post 3");

        Iterator<Post> iterator = board.getPosts().iterator();
        while (iterator.hasNext()) {
            Post post = iterator.next();
            System.out.println(post.getTitle());
        }

        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            Post post = recentPostIterator.next();
            System.out.println(post.getTitle());
        }

    }
}
