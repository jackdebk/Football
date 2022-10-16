package teams.plays.playList;

import teams.players.Player;

import java.util.ArrayList;

public abstract class Cover3_43 extends Formation43 {
    private ArrayList<Player> DL = super.team.getPosition(Player.Position.DL);
    private ArrayList<Player> LB = super.team.getPosition(Player.Position.LB);
    private ArrayList<Player> CB = super.team.getPosition(Player.Position.CB);
    private ArrayList<Player> S = super.team.getPosition(Player.Position.S);
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
    public void assignPass(){
        areas.getLeftFlat().addDefensivePlayer(Sam);
        areas.getRightFlat().addDefensivePlayer(SS);
        areas.getLeftHole().addDefensivePlayer(Mike);
        areas.getRightHole().addDefensivePlayer(Will);
        areas.getLeftDeep().addDefensivePlayer(StrongCorner);
        areas.getCenterDeep().addDefensivePlayer(FS);
        areas.getRightDeep().addDefensivePlayer(WeakCorner);
    }
    private void assignSafety(){
        areas.getLeftHole().addDefensivePlayer(SS);
        areas.getRightHole().addDefensivePlayer(SS);
    }
    public abstract void assignPassRush();
}
