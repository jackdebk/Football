package teams.players;

public class Player {
    public enum Position{
        QB,
        HB,
        WR,
        TE,
        OL,
        DL,
        LB,
        CB,
        S,
        P,
        K
    }
    private Stats stats;
    private String name;
    private String description;
    private int level;
    private int stars;
    private Position position;

    public Player(Stats stats, String name, String description, int level, int stars, Position position) {
        this.stats = stats;
        this.name = name;
        this.description = description;
        this.level = level;
        this.position = position;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
