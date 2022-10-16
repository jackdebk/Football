package teams.plays.playList;

import teams.players.Player;
import teams.plays.DefensivePlay;
import teams.plays.*;
import java.util.*;

public abstract class Formation43 extends DefensivePlay {
    AreaList areas;

    private ArrayList<Player> DL = super.team.getPosition(Player.Position.DL);
    private ArrayList<Player> LB = super.team.getPosition(Player.Position.LB);
    private ArrayList<Player> CB = super.team.getPosition(Player.Position.CB);
    private ArrayList<Player> S = super.team.getPosition(Player.Position.S);
    private Player StrongEnd = DL.get(0);
    private Player StrongTackle = DL.get(1);
    private Player WeakTackle = DL.get(2);
    private Player WeakEnd = DL.get(3);
    private Player Sam = LB.get(0);
    private Player Mike = LB.get(1);
    private Player Will = LB.get(2);
    private Player StrongCorner = CB.get(0);
    private Player WeakCorner = CB.get(1);
    private Player SS = S.get(0);
    private Player FS = S.get(1);
    public void assignRun(){

        //DL
        areas.getLeftDGap().addDefensivePlayer(StrongEnd);
        areas.getLeftBGap().addDefensivePlayer(StrongTackle);
        areas.getRightAGap().addDefensivePlayer(WeakTackle);
        areas.getRightCGap().addDefensivePlayer(WeakEnd);
        //LB
        areas.getLeftCGap().addDefensivePlayer(Sam);
        areas.getLeftAGap().addDefensivePlayer(Mike);
        areas.getRightBGap().addDefensivePlayer(Will);
        //C
        areas.getLeftFlat().addDefensivePlayer(StrongCorner);
        areas.getRightFlat().addDefensivePlayer(WeakCorner);
        //S
        areas.getLeftDeep().addDefensivePlayer(SS);
        areas.getRightDeep().addDefensivePlayer(FS);
        areas.getCenterDeep().addDefensivePlayer(SS);
        areas.getCenterDeep().addDefensivePlayer(FS);
        assignSafety();
    }
    private abstract void assignSafety();
}
