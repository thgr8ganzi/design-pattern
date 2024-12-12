package org.example.designpattern._03_behavioral.state._02_after;


public interface State {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
