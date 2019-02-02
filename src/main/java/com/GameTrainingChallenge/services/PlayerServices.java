package com.GameTrainingChallenge.services;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.domain.repository.PlayerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServices {

    @Autowired
    PlayerInterface playerRepository;

    public List<Player> returnPlayers(){
        //method returns list of all players using injected playerRepository object
        //method use method of repository class returns all players from database
        //method for return all players on main web page

        return new ArrayList<>(playerRepository.returnPlayers());
    }

    public void createPlayer(Player player){
        //method forwards object of player class from controller to repository
        //method add object of player with set variables by user on web page to database
        // using method of injected playerRepository object

        playerRepository.createPlayer(player);
    }

    public Player returnPlayerById(Integer id){
        //method forward sent id from player controller to repository method to return object
        // of player by id
        //method using injected playerRepository object
        //method of repository returns object of player by id from database to display details
        // of player on web page

        return playerRepository.returnPlayerById(id);
    }

    public void deletePlayer(Integer id){
        //method forwards sent id from player controller to repository method
        //method using injected playerRepository object
        //method of repository remove player from database using sent id
        //user selecting player to delete generate his id which is sent from controller
        // of player to method of service

        playerRepository.deletePlayer(id);
    }
}
