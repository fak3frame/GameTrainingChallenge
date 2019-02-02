package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.Player;
import com.GameTrainingChallenge.utils.GenerateNewId;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class PlayerRepository implements PlayerInterface{

    //to tests using map as database
    Map<Integer, Player> players = new HashMap<>();

    @Override
    //method that operations will be using database
    public void createPlayer(String playerName, int age) {
        //method creates new players by starter class

        Player newPlayer = new Player(playerName, age);

        //local database using map
        Integer newId = GenerateNewId.createNewId(players.keySet());
        newPlayer.setId(newId);
        players.put(newId, newPlayer);
    }

    @Override
    public void createPlayer(Player player) {
        //method creates new players by user on web page

        //controller->service sends object of player with variables set
        // by user on web page in forms

        Player newPlayer = new Player(player);

        //local database using map
        Integer newId = GenerateNewId.createNewId(players.keySet());
        newPlayer.setId(newId);
        players.put(newId, newPlayer);
    }

    @Override
    public void deletePlayer(Integer id) {

    }

    @Override
    public Player returnPlayerById(Integer id) {
        return null;
    }

    @Override
    public Optional<Player> returnPlayerByName(String playerName) {
        return Optional.empty();
    }

    @Override
    public Collection<Player> returnPlayers() {
        return null;
    }

    @Override
    public void updatePlayer(Player player) {

    }
}
