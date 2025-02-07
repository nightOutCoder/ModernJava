package com.modernjava.optionalexample.optionalExcercise;

import java.util.Optional;


public class Demo {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("jack","jack@gmail.com","12344");
        Course course1 = new Course("ML/AI",12000,Optional.ofNullable(trainer1));
        Student studen1 = new Student("Ramesh", "ramesh@gmail.com",121,Optional.ofNullable(course1));

        Optional<Student> myStudent = Optional.ofNullable(studen1);

        /* Get the email id of a specific trainer */
        Optional<Course> myCourse = myStudent.flatMap(input -> input.getCourse());
        Optional<Trainer> myTrainer = myCourse.flatMap(data -> data.getTrainer());
        Optional<String> trainerStrin = myTrainer.map(trainer -> trainer.getTrainerEmail());
        String email = trainerStrin.orElse("Email not present");
        System.out.println(email);

        /* Get the email id of a specific trainer - In single line */
        String emailRef = myStudent.flatMap(input -> input.getCourse()).flatMap(data -> data.getTrainer()).map(trainer -> trainer.getTrainerEmail()).orElse("Email not present");
        System.out.println(emailRef);
    }
}
