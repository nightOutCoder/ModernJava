package com.modernjava.optionalexample.optionalExcercise;

public class Trainer {
    private String trainerName;
    private String trainerEmail;
    private String trainerPhone;

    public String getTrainerName() {
        return trainerName;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public String getTrainerPhone() {
        return trainerPhone;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public void setTrainerPhone(String trainerPhone) {
        this.trainerPhone = trainerPhone;
    }

    public Trainer() {
    }

    public Trainer(String trainerName, String trainerEmail, String trainerPhone) {
        this.trainerName = trainerName;
        this.trainerEmail = trainerEmail;
        this.trainerPhone = trainerPhone;
    }

}
