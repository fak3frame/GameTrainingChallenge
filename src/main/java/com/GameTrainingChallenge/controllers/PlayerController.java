package com.GameTrainingChallenge.controllers;

import com.GameTrainingChallenge.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

    @Autowired
    PlayerServices playerServices;
}
