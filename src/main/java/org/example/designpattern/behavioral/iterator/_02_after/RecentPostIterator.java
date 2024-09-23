package org.example.designpattern.behavioral.iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> inernalIterator;
    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.inernalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.inernalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.inernalIterator.next();
    }
}
