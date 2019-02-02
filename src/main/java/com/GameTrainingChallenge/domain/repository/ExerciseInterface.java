package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.TrainingExercise;

import java.util.Collection;

public interface ExerciseInterface {
    void createExercise(TrainingExercise trainingExercise);

    void createExercise(String nameOfExercise, int numberOfRepetitions, int rewardInPoints);

    Collection<TrainingExercise> returnExercises();

    TrainingExercise returnExercise(Integer id);
}
