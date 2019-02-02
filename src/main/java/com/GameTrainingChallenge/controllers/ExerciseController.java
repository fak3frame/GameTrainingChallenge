package com.GameTrainingChallenge.controllers;

import com.GameTrainingChallenge.services.ExerciseServices;
import com.GameTrainingChallenge.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ExerciseController {

    @Autowired
    PlayerServices playerServices;

    @Autowired
    ExerciseServices exerciseServices;
}
