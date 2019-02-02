package com.GameTrainingChallenge.services;

import com.GameTrainingChallenge.domain.TrainingExercise;
import com.GameTrainingChallenge.domain.repository.ExerciseInterface;
import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ExerciseServices {

    @Autowired
    ExerciseInterface exerciseRepository;

    @Autowired
    PlayerInterface playerRepository;

    final static Random rand = new Random();

    public void assignRandomExercise(String nickName){
        //method sets random exercise to selected player
        //user select player on web page and controller sends nickname of this player
        //method creates list of all exercise using method of exercise repository
        // and select random exercise
        //selected exercise is assign to player with sent nickname using player repository
        // method which returns object of player by nickname and method sets exercise

        List<TrainingExercise> exercises = new ArrayList<>(exerciseRepository.returnExercises());

        int numberOfRandomExercise = rand.nextInt(exercises.size());

        TrainingExercise trainingExercise = exercises.get(numberOfRandomExercise);

        playerRepository.returnPlayerByName(nickName).ifPresent(x -> x.setTrainingExercise(trainingExercise));
    }

    public List<TrainingExercise> returnExercises(){
        //method return list of all exercises
        //method for manual set exercise to player by user on web page

        return new ArrayList<>(exerciseRepository.returnExercises());
    }
}
