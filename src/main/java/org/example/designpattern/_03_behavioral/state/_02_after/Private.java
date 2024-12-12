package org.example.designpattern._03_behavioral.state._02_after;

public class Private implements State{
    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudent().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("Student is not enrolled in this course");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvaliable(this.onlineCourse)) {
            this.onlineCourse.getStudent().add(student);
        } else {
            throw new UnsupportedOperationException("Student is not enrolled in this course");
        }
    }
}
