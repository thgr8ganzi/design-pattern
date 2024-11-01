package org.example.designpattern._02_structural.decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("Nice post!");
        client.writeComment("Nice post...!");
        client.writeComment("Nice post! Buy my product!");
        client.writeComment("Nice post! Buy my product! Buy my product!");
        client.writeComment("http://www.example.com");
    }
}
