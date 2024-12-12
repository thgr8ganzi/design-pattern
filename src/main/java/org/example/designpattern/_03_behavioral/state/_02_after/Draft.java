package org.example.designpattern._03_behavioral.state._02_after;

public class Draft implements State{
    private OnlineCourse onlineCourse;

    public Draft(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("Draft state does not support addReview");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudent().add(student);
        if (this.onlineCourse.getStudent().size() > 1) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }
}
