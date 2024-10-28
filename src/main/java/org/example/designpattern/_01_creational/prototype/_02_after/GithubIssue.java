package org.example.designpattern._01_creational.prototype._02_after;

import lombok.Data;

import java.util.Objects;

@Data
public class GithubIssue implements Cloneable{
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());
        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);
        return githubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }
}
