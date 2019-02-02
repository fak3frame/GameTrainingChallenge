package com.GameTrainingChallenge.services;

import com.GameTrainingChallenge.domain.repository.ExerciseInterface;
import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExerciseServices {

    @Autowired
    ExerciseInterface exerciseRepository;

    @Autowired
    PlayerInterface playerRepository;

    final static Random rand = new Random();
}
