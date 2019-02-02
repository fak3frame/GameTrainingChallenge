package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.TrainingExercise;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ExerciseRepository implements ExerciseInterface{
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
