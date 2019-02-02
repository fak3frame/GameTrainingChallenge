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

    }
}
