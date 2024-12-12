package org.example.designpattern._03_behavioral.state._02_after;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("lee");
        Student student1 = new Student("kim");
        student1.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("good", student);

        onlineCourse.addStudent(student1);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudent());
        System.out.println(onlineCourse.getReviews());
    }
}
