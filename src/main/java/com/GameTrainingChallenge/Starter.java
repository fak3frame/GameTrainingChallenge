package com.GameTrainingChallenge;

import com.GameTrainingChallenge.domain.repository.ExerciseInterface;
import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    ExerciseInterface exerciseRepo;

    @Autowired
    PlayerInterface playerRepo;

    @Override
    public void run(String... args) throws Exception {

        //----CREATING STARTING PLAYERS (for tests)
        playerRepo.createPlayer("Kamil", 28);
        playerRepo.createPlayer("Tomas", 30);


        //----CREATING EXERCISES
        exerciseRepo.createExercise("Push ups", 5, 10);
        exerciseRepo.createExercise("Squat Jumps", 10, 5);

    }
}
