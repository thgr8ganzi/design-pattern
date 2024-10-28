package org.example.designpattern._01_creational.prototype._02_after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("user");
        repository.setName("name");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("issue title");


        String url = issue.getUrl();
        System.out.println(url);

        GithubIssue issue2 = (GithubIssue) issue.clone();
        System.out.println(issue2.getUrl());

        repository.setUser("user2");

        System.out.println(issue != issue2);
        System.out.println(issue.equals(issue2));
        System.out.println(issue.getClass() == issue2.getClass());
        System.out.println(issue2.getRepository() == issue.getRepository());

        System.out.println(issue2.getUrl());
    }
}
