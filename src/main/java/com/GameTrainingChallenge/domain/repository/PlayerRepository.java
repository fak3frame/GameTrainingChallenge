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
        //method deletes player by user (select id on web page)

        //local database using map
        players.remove(id);
    }

    @Override
    public Player returnPlayerById(Integer id) {
        //method returns player selected by user on web page to display
        // details of the player on the next page

        //local database using map
        return players.get(id);
    }

    @Override
    public Optional<Player> returnPlayerByName(String playerName) {
        //method returns Optional of player based on sent name of player

        //method for assign random exercise to selected player by user on web
        // page

        //local database using map
        Optional<Player> player = players.values().stream()
                .filter(x -> x.getPlayerName().equals(playerName))
                .findAny();

        return player;
    }

    @Override
    public Collection<Player> returnPlayers() {
        return null;
    }

    @Override
    public void updatePlayer(Player player) {

    }
}
