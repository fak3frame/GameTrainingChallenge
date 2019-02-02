package com.GameTrainingChallenge.controllers;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    PlayerServices playerServices;

    @RequestMapping("/players")
    //main page link
    public String retrnPlayers(Model model){
        //Model variable supports forwarding objects to frontend

        List<Player> players = playerServices.returnPlayers();
        //creating list of pllayers from database using service

        model.addAttribute("players", players);
        //add to model all list of players - object called "players" in frontend

        return "players";
        //retrun logic name of html file
        //handler mapping of link
    }
}
