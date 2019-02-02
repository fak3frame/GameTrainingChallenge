package com.GameTrainingChallenge.controllers;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
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

    @RequestMapping("/addplayer")
    //player adding page link
    public String addPlayer(Model model){
        Player player = new Player();
        //add new empty object of player

        model.addAttribute("player", player);
        //add to model empty object of player

        return "addplayer";
        //return logic name of html file
        //handler mapping of link
    }

    @RequestMapping(value = "/readyplayer", method = RequestMethod.POST)
    //handler mapping of return ready new player object created on page in forms
    public String addPlayer(@Valid Player player, BindingResult bindingResult){
        //recives ready player object with checking variables using @Valid
        // and BindingResult object to handle errors made by user in forms
        //requirements of player object variables are declared in the players class
        // (@Range/@Size)
        //new web page is not handled so model is not needed

        if(bindingResult.hasErrors()){
            //handling errors

            return "addplayer";
            //again redirect to add player page
        }
        else {
            //if object of player is without errors

            playerServices.createPlayer(player);
            //new object of player is adding to database using service/repo method

            return "redirect:/players";
            //redirect to main page
        }
    }
}
