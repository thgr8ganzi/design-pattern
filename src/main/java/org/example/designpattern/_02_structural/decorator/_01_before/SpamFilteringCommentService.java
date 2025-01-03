package org.example.designpattern._02_structural.decorator._01_before;

public class SpamFilteringCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
