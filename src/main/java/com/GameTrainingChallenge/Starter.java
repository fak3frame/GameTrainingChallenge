package com.GameTrainingChallenge;

import com.GameTrainingChallenge.domain.LoginUsers;
import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.domain.TrainingExercise;
import com.GameTrainingChallenge.domain.repository.CreateUserLoginInterace;
import com.GameTrainingChallenge.domain.repository.ExerciseInterface;
import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import com.GameTrainingChallenge.utils.Permissions;
import com.GameTrainingChallenge.utils.PermissionsRepository;
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

    @Autowired
    CreateUserLoginInterace createUserLogin;

    @Autowired
    PermissionsRepository permissions;

    @Override
    public void run(String... args) throws Exception {


        //----CREATING USERS AND PASSWORDS
        LoginUsers user1 = new LoginUsers("user1", "pass1");
        LoginUsers user2 = new LoginUsers("user2", "pass2");

        //add them to database
        createUserLogin.createUserLogin(user1);
        createUserLogin.createUserLogin(user2);


        //----CREATING PERMISSIONS
        Permissions permissionsUser1 = new Permissions("user1", "USER");
        Permissions permissionsUser2 = new Permissions("user2", "USER");
        Permissions permissionsAdmin = new Permissions("user2", "ADMIN");

        //add them to database
        permissions.addPermissions(permissionsUser1);
        permissions.addPermissions(permissionsUser2);
        permissions.addPermissions(permissionsAdmin);





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
