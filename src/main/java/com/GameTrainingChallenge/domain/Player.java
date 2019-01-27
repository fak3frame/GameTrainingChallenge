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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public TrainingExercise getTrainingExercise() {
        return trainingExercise;
    }

    public void setTrainingExercise(TrainingExercise trainingExercise) {
        this.trainingExercise = trainingExercise;
    }
}
