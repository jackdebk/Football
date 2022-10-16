package teams.players;

public class Stats {
    //Physical
    private int size;
    private int speed;
    private int strength;
    private int injury;
    //QB
    private int armPower;
    private int accuracy;
    //Running
    private int vision;
    private int breakTackle;
    private int carry;
    //Receiving
    private int catching;
    private int routeRunning;
    //Blocking
    private int runBlock;
    private int passBlock;
    //Defense
    private int passRush;
    private int runStop;
    private int coverage;
    private int tackling;
    private int hitPower;
    //Special Teams
    private int kickPower;
    private int kickAccuracy;

    public Stats(int size, int speed, int strength, int injury, int armPower, int accuracy, int vision, int breakTackle, int carry, int catching, int routeRunning, int runBlock, int passBlock, int passRush, int runStop, int coverage, int tackling, int hitPower, int kickPower, int kickAccuracy) {
        this.size = size;
        this.speed = speed;
        this.strength = strength;
        this.injury = injury;
        this.armPower = armPower;
        this.accuracy = accuracy;
        this.vision = vision;
        this.breakTackle = breakTackle;
        this.carry = carry;
        this.catching = catching;
        this.routeRunning = routeRunning;
        this.runBlock = runBlock;
        this.passBlock = passBlock;
        this.passRush = passRush;
        this.runStop = runStop;
        this.coverage = coverage;
        this.tackling = tackling;
        this.hitPower = hitPower;
        this.kickPower = kickPower;
        this.kickAccuracy = kickAccuracy;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getInjury() {
        return injury;
    }

    public void setInjury(int injury) {
        this.injury = injury;
    }

    public int getArmPower() {
        return armPower;
    }

    public void setArmPower(int armPower) {
        this.armPower = armPower;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getBreakTackle() {
        return breakTackle;
    }

    public void setBreakTackle(int breakTackle) {
        this.breakTackle = breakTackle;
    }

    public int getCarry() {
        return carry;
    }

    public void setCarry(int carry) {
        this.carry = carry;
    }

    public int getCatching() {
        return catching;
    }

    public void setCatching(int catching) {
        this.catching = catching;
    }

    public int getRouteRunning() {
        return routeRunning;
    }

    public void setRouteRunning(int routeRunning) {
        this.routeRunning = routeRunning;
    }

    public int getRunBlock() {
        return runBlock;
    }

    public void setRunBlock(int runBlock) {
        this.runBlock = runBlock;
    }

    public int getPassBlock() {
        return passBlock;
    }

    public void setPassBlock(int passBlock) {
        this.passBlock = passBlock;
    }

    public int getPassRush() {
        return passRush;
    }

    public void setPassRush(int passRush) {
        this.passRush = passRush;
    }

    public int getRunStop() {
        return runStop;
    }

    public void setRunStop(int runStop) {
        this.runStop = runStop;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public int getTackling() {
        return tackling;
    }

    public void setTackling(int tackling) {
        this.tackling = tackling;
    }

    public int getHitPower() {
        return hitPower;
    }

    public void setHitPower(int hitPower) {
        this.hitPower = hitPower;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getKickAccuracy() {
        return kickAccuracy;
    }

    public void setKickAccuracy(int kickAccuracy) {
        this.kickAccuracy = kickAccuracy;
    }
}
