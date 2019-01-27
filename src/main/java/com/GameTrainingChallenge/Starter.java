package com.GameTrainingChallenge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
