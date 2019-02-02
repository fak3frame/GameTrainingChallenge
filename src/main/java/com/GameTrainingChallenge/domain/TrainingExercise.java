package com.GameTrainingChallenge.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TrainingExercises")
@TableGenerator(name="sequenceOfExercises", initialValue=0, allocationSize=50)
public class TrainingExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "sequenceOfExercises")
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingExercise that = (TrainingExercise) o;
        return id == that.id &&
                numberOfRepetitions == that.numberOfRepetitions &&
                rewardInPoints == that.rewardInPoints &&
                Objects.equals(nameOfExercise, that.nameOfExercise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfExercise, numberOfRepetitions, rewardInPoints);
    }


    @Override
    public String toString() {
        return "TrainingExercise{" +
                "id=" + id +
                ", nameOfExercise='" + nameOfExercise + '\'' +
                ", numberOfRepetitions=" + numberOfRepetitions +
                ", rewardInPoints=" + rewardInPoints +
                '}';
    }
}
