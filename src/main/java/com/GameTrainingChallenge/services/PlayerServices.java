package com.GameTrainingChallenge.services;

import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServices {

    @Autowired
    PlayerInterface playerRepository;
}
