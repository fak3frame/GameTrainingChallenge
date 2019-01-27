package com.GameTrainingChallenge.domain;

public class TrainingExercise {

    private int id;

    private String nameOfExercise;

    private int numberOfRepetitions;

    private int rewardInPoints;


    public TrainingExercise(){
        //for creating a new empty class object
        //for hibernate
    }

    public TrainingExercise(String nameOfExercise, int numberOfRepetitions, int rewardInPoints){
        //for creating Exercise from Starter class
        //Exercise are creating ONLY in Starter class
        this.nameOfExercise = nameOfExercise;
        this.numberOfRepetitions = numberOfRepetitions;
        this.rewardInPoints = rewardInPoints;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setNameOfExercise(String nameOfExercise) {
        this.nameOfExercise = nameOfExercise;
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    public int getRewardInPoints() {
        return rewardInPoints;
    }

    public void setRewardInPoints(int rewardInPoints) {
        this.rewardInPoints = rewardInPoints;
    }
}
