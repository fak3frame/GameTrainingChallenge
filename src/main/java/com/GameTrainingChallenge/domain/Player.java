package com.GameTrainingChallenge.domain;

public class Player {

    private int id;

    private int age;

    private String playerName;

    private int points;

    private String nickName;

    private TrainingExercise trainingExercise;


    public Player(){
        //for creating a new empty class object
        //for hibernate
    }

    public Player(String playerName, int age){
        //for creating Player from Starter class
        this.playerName = playerName;
        this.age = age;
    }

    public Player(Player player){
        //for creating Player on web page by the user
        this.playerName = player.playerName;
        this.age = player.age;
        this.trainingExercise = player.trainingExercise;
    }
}
