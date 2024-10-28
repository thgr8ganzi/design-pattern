package org.example.designpattern._01_creational.prototype._01_before;

public class App {
    public static void main(String[] args) {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("user");
        repository.setName("name");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("issue title");


        String url = issue.getUrl();
        System.out.println(url);

        GithubIssue issue2 = new GithubIssue(repository);
        issue2.setId(2);
        issue2.setTitle("issue title2");

        String url2 = issue2.getUrl();
        System.out.println(url2);
    }
}
