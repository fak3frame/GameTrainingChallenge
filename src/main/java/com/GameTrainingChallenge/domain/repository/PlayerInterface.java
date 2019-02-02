package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.Player;

import java.util.Collection;
import java.util.Optional;

public interface PlayerInterface {
    void createPlayer(String playerName, int age);

    void createPlayer(Player player);

    void deletePlayer(Integer id);

    Player returnPlayerById(Integer id);

    Optional<Player> returnPlayerByName(String playerName);

    Collection<Player> returnPlayers();

    void updatePlayer(Player player);
}
