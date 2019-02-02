package com.GameTrainingChallenge.domain;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "Players")
@TableGenerator(name = "sequenceOfPlayers", initialValue = 0, allocationSize = 50)
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "sequenceOfPlayers")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Range(min = 18, max = 55, message = "Available age range: 18-55")
    private int age;

    @NotNull
    @Size(min = 3, max = 10, message = "Available length of the name: 3-10 char.")
    @Column(name = "Player_Name")
    private String playerName;

    private int points;

    @Transient//variable invisible for hibernate
    private String nickName;

    @OneToOne
    //object variable type of another table
    //foreign key
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                age == player.age &&
                points == player.points &&
                Objects.equals(playerName, player.playerName) &&
                Objects.equals(nickName, player.nickName) &&
                Objects.equals(trainingExercise, player.trainingExercise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, playerName, points, nickName, trainingExercise);
    }


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", age=" + age +
                ", playerName='" + playerName + '\'' +
                ", points=" + points +
                ", nickName='" + nickName + '\'' +
                ", trainingExercise=" + trainingExercise +
                '}';
    }
}
