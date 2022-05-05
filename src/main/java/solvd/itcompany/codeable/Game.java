package solvd.itcompany.codeable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game extends Application implements Instalable {

    private static final Logger log = LogManager.getLogger(Game.class);
    private double gameDuration;
    private boolean multiplayer;
    private String difficulty;

    public Game(int basicPrice, int timeTakes, double gameDuration, boolean multiplayer) {
        super(basicPrice, timeTakes);
        this.gameDuration = gameDuration;
        this.multiplayer = multiplayer;

    }

    public double GameDuration() {
        return gameDuration;
    }

    public void setGameDuration(double gameDuration) {
        this.gameDuration = gameDuration;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    @Override
    public void installation(boolean meetsRequirements, String deviceName) {
        if (meetsRequirements) {
            log.info("This game was installed in " + deviceName);
        } else {
            log.info("This game cannot be installed");
        }

    }

    public String getDifficulty() {
        return difficulty;
    }

    public void assignDifficulty(Difficulties diffs) {
        this.difficulty = diffs.name();
    }
}
