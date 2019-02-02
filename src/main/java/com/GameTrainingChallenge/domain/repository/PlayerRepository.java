package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.Player;
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
    public void createPlayer(String playerName, int age) {

    }

    @Override
    public void createPlayer(Player player) {

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
