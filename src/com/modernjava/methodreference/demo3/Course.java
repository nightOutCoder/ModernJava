package com.modernjava.methodreference.demo3;

public class Course {
    private int id;
    private String courseName;
    private double price;
    private String faculty;

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getPrice() {
        return price;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Course() {
        System.out.println("0 argument constructor");
    }

    public Course(int id, String courseName, double price, String faculty) {
        System.out.println("4 argument constructor");
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.faculty = faculty;
    }

    public Course(String courseName, double price, String faculty) {
        System.out.println("3 argument constructor");
        this.courseName = courseName;
        this.price = price;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", price=" + price + ", faculty=" + faculty + "]";
    }
}
