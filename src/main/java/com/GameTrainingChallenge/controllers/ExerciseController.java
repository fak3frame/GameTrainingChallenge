package com.GameTrainingChallenge.controllers;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.domain.TrainingExercise;
import com.GameTrainingChallenge.services.ExerciseServices;
import com.GameTrainingChallenge.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExerciseController {

    @Autowired
    PlayerServices playerServices;

    @Autowired
    ExerciseServices exerciseServices;

    @RequestMapping(value = "/assignexercisetoplayer/id={id}")
    //manual assign exercise to player page
    //handler mapping using with PATH generated in frontend using unique id of player
    //user chooses which player he wants to assign exercise on main page
    public String assignExercise(@PathVariable("id")Integer id, Model model){
        //again capture variable in path

        List<TrainingExercise> exercises = exerciseServices.returnExercises();
        //create list of all exercises from database using service/repo method

        Player player = playerServices.returnPlayerById(id);
        //create player and assign to selected player by id from database

        model.addAttribute("player", player);
        //add to model object player
        //* by default frontend is not capture value of variables single object (not list)
        //* to capture values sent object frontend must have input type="hidden"
        //*  tag with selected field of object like "th:field="*{nickName}"
        //*  for example <input type="hidden" th:field="*{nickName}">

        model.addAttribute("exercises", exercises);
        //add to model list of all exercises
        //player select which exercise will be assign to selected player

        return "assignplayer";
        //assign exercise to single player page
    }
}
