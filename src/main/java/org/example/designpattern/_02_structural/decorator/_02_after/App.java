package org.example.designpattern._02_structural.decorator._02_after;


public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enableTrimmingFilter = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enableTrimmingFilter) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        Client client = new Client(commentService);

        client.writeComment("Nice post!");
        client.writeComment("Nice post...!");
        client.writeComment("Nice post! Buy my product!");
        client.writeComment("Nice post! Buy my product! Buy my product!");
        client.writeComment("http://www.example.com");
    }
}
