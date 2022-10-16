package teams;

import teams.players.Player;
import java.util.*;

public class Team {
    private ArrayList<Player> players;
    public ArrayList<Player> getPosition(Player.Position position){
        ArrayList<Player> retList = new ArrayList<Player>();
        for(Player p : players){
            if(p.getPosition().equals(position)){
                retList.add(p);
            }
        }
        return retList;
    }
}
