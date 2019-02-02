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
        //method put exercise in database

        //method for put exercise into database sent by Starter class

        TrainingExercise newExercise = new TrainingExercise(nameOfExercise, numberOfRepetitions, rewardInPoints);

        //local database using map
        Integer newId = GenerateNewId.createNewId(exercises.keySet());

        newExercise.setId(newId);

        exercises.put(newId, newExercise);
    }

    @Override
    public Collection<TrainingExercise> returnExercises() {
        //method returns all exercises

        //method for set random exercise to selected player by user on web page
        //method for manual set exercise to player by user on web page

        //local database using map
        return exercises.values();
    }

    @Override
    public TrainingExercise returnExercise(Integer id) {
        //method return exercise by sent id

        //method used in parsing id of exercise to object of exercise when user manually set exercise to player
        // on web page

        //local database using map
        return exercises.get(id);
    }
}
