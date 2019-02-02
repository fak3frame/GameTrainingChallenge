package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.TrainingExercise;
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
