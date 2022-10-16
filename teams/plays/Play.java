package teams.plays;

import teams.Team;

public abstract class Play {
    public Team team;
    private AreaList areas;
    private Interaction first;
    private Interaction second;
    private Interaction third;
    public abstract void assignAreas();
}
