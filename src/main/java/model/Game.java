package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int id;
    private String name;
    private Map <Player, List <Attainment>> players;
    private Player gameAdmin;

    public Game(int id, String name, Map<Player, List<Attainment>> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }
}
