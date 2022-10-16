package teams.plays;
import teams.players.*;
import java.util.*;

public class Area {
    private String name;
    private ArrayList<Player> offensivePlayers;
    private ArrayList<Player> defensivePlayers;
    public void addDefensivePlayer(Player p){
        defensivePlayers.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getOffensivePlayers() {
        return offensivePlayers;
    }

    public void setOffensivePlayers(ArrayList<Player> offensivePlayers) {
        this.offensivePlayers = offensivePlayers;
    }

    public ArrayList<Player> getDefensivePlayers() {
        return defensivePlayers;
    }

    public void setDefensivePlayers(ArrayList<Player> defensivePlayers) {
        this.defensivePlayers = defensivePlayers;
    }
}
