package org.example.designpattern._02_structural.decorator._02_after;

public class TrimmingCommentDecorator extends CommentDecorator{

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
