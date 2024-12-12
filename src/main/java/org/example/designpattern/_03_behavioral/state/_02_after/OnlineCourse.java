package org.example.designpattern._03_behavioral.state._02_after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private State state = new Draft(this);

    private List<Student> student = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student) {
        state.addStudent(student);
    }
    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudent() {
        return student;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void changeState(Private aState) {
        this.state = aState;
    }
}
