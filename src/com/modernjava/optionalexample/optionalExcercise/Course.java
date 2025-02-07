package com.modernjava.optionalexample.optionalExcercise;

import java.util.Optional;

public class Course {
    private String courseName;
    private double coursePrice;
    private Optional<Trainer> trainer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Optional<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(Optional<Trainer> trainer) {
        this.trainer = trainer;
    }

    public Course() {

    }

    public Course(String courseName, double coursePrice, Optional<Trainer> trainer) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.trainer = trainer;
    }

}
