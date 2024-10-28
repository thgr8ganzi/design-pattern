package org.example.designpattern._01_creational.prototype._01_before;

import lombok.Data;

@Data
public class GithubIssue {
    private int id;
    private String title;
    private GitHubRepository repository;

    public GithubIssue(GitHubRepository repository) {
        this.repository = repository;
    }
    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
}
