package com.GameTrainingChallenge.services;

import com.GameTrainingChallenge.domain.TrainingExercise;
import com.GameTrainingChallenge.domain.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class ExerciseFormatter implements Formatter<TrainingExercise> {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public TrainingExercise parse(String s, Locale locale) throws ParseException {
        //method parsing selected value of field of object in selection list
        // to his object

        //created to parse id of exercise to object of that exercise

        //id is integer but by default it is converting to String in selection list
        // so i have to convert id as String to object of exercise

        Integer id = Integer.parseInt(s);
        //parsing Sting to id to get object of exercise from database

        //create empty exercise object and mapping to exercise from database
        TrainingExercise trainingExercise = exerciseRepository.returnExercise(id);

        //return object of exercise
        return trainingExercise;
    }

    @Override
    public String print(TrainingExercise trainingExercise, Locale locale) {
        return trainingExercise.toString();
    }
}
