package solvd.itcompany.codeable;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Game extends Application implements Instalable {

    private static final Logger log = LogManager.getLogger(Game.class);
    private double gameDuration;
    private boolean multiplayer;
    private String dificulty;


    public Game(int basicprice, String type, String subtype, int timetakes, double gameDuration, boolean multiplayer, String dificulty) {
        super(basicprice, type, subtype, timetakes);
        this.gameDuration = gameDuration;
        this.multiplayer = multiplayer;
        this.dificulty = dificulty;
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

    public String Dificulty() {
        return dificulty;
    }

    public String setDificulty(String dificulty) {
        return dificulty;
    }

    @Override
    public void installation(boolean meetsRequirements, String deviceName) {
        if (meetsRequirements) {
            log.info("This game was installed in " + deviceName);
        } else {
            log.info("This game cannot be installed");
        }

    }


}
