package org.example.designpattern._03_behavioral.state._01_before;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("lee");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student jisoo = new Student("jisoo");
        jisoo.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(jisoo);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
