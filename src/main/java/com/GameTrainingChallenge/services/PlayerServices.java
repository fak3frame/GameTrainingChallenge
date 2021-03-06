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

    public void updatePlayer(Player player){
        //method forward object of player from player controller to repository method
        //method using injected playerRepository object
        //method for manual assign exercise to player by user on web page
        //user assigning exercise to player sends object of player with set exercise
        //method of repository update object of player in database

        playerRepository.updatePlayer(player);
    }

    public void completeExercise(Player player){
        //method gets points of exercise of player and add them to points of player
        // then set exercise player to null and send modified object of player
        //method using injected playerRepository object
        //user chooses on web page player who finish exercise
        //method of player repository update player in database

        Integer points = player.getTrainingExercise().getRewardInPoints();
        player.setTrainingExercise(null);
        player.setPoints(player.getPoints()+points);

        playerRepository.updatePlayer(player);
    }
}
