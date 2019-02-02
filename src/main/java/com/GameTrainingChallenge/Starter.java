package com.GameTrainingChallenge;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.domain.TrainingExercise;
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

        //----CREATING STARTING PLAYER WITH ASSIGNED EXERCISE AT START
        //creating next new player using special constructor in player class
        Player player = new Player("Pawel", 29);

        //creating new exercise
        TrainingExercise exercise = new TrainingExercise("Situps", 10, 10);

        //add new exercise to database
        exerciseRepo.createExercise(exercise);

        //assign exercise to player
        player.setTrainingExercise(exercise);

        //add new player with exercise to database
        playerRepo.createPlayer(player);
    }
}
