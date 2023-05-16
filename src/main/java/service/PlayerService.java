package service;

import model.Player;

public interface PlayerService {
    Player getPlayerById(Long id);
    Player savePlayer(Player player);
    void deletePlayer(Long id);
    // Add any other methods for player-related business logic
}
