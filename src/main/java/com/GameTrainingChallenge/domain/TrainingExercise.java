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
}
