package deo;

import model.Player;
import java.util.List;

public interface PlayerDao {
    List<Player> getAllPlayers();
    Player getPlayerById(int id);
    void addPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(int id);
}

