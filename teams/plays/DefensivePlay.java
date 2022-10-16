package teams.plays;

import teams.Team;

public abstract class DefensivePlay extends Play{
    public Team team = super.team;

    public abstract void assignRun();
    public abstract void assignPass();
}
