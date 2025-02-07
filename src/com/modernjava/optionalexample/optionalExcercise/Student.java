package com.modernjava.optionalexample.optionalExcercise;

import java.util.Optional;

public class Student {
    private String studentName;
    private String trainerEmail;
    private long studentPhone;
    private Optional<Course> course;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(long studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Optional<Course> getCourse() {
        return course;
    }

    public void setCourse(Optional<Course> course) {
        this.course = course;
    }

    public Student() {

    }

    public Student(String studentName, String trainerEmail, long studentPhone, Optional<Course> course) {
        this.studentName = studentName;
        this.trainerEmail = trainerEmail;
        this.studentPhone = studentPhone;
        this.course = course;
    }

}
