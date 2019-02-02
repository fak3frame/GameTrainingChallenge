package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.TrainingExercise;
import com.GameTrainingChallenge.utils.GenerateNewId;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ExerciseRepository implements ExerciseInterface{

    //local database using map
    Map<Integer, TrainingExercise> exercises = new HashMap<>();

    @Override
    public void createExercise(TrainingExercise trainingExercise) {
        //method put exercise in database

        //method for put exercise into database sent by Sterter class
        //method for create testing player in database with exercise sent by Starter class

        //local database using map
        Integer newId = GenerateNewId.createNewId(exercises.keySet());

        exercises.put(newId, trainingExercise);
    }

    @Override
    public void createExercise(String nameOfExercise, int numberOfRepetitions, int rewardInPoints) {

    }

    @Override
    public Collection<TrainingExercise> returnExercises() {
        return null;
    }

    @Override
    public TrainingExercise returnExercise(Integer id) {
        return null;
    }
}
