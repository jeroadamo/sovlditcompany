package solvd.itcompany.person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Game;
import solvd.itcompany.exceptions.CannotWorkException;

public class SeniorDev extends Employee implements IWork, IGetFrustrated{
    private static final Logger LOGGER   = LogManager.getLogger(Game.class);
    private String can;
    private boolean levelOfExp;

    public SeniorDev(String name, int id, int age, int salary) {
        super(salary, name, id, age);
    }

    public SeniorDev(String can, boolean levelOfExp, String name, int id, int age, int salary) {
        super(name, id, age);
        this.can = can;
        this.levelOfExp = levelOfExp;
    }

    public String getCan() {
        return can;
    }
    public void setCan(String can) {
        this.can = can;
    }


    public boolean isLevelOfExp() {
        return levelOfExp;
    }
    public void setLevelOfExp(boolean levelOfExp) {
        this.levelOfExp = levelOfExp;
    }


    @Override
    public void workerInActivity(boolean working){
        if (working){
            LOGGER.info("This SeniorDev is Working!");
        }
        else{
            LOGGER.info("This SeniorDev is in his/her break");
        }
    }
    @Override
    public void frustration(Employee worker, boolean frustrated) throws CannotWorkException {

        if (can == "Unavailable for work"){
            frustrated = true;
            throw new CannotWorkException("This developer is stressed out. Brake suggested.");
        }
        if (can == "Available for more work"){
            frustrated = false;
            LOGGER.info("This developer is chilling for now");
        }
    }

    @Override
    public String toString() {
        return "Habilitated?: " + can + " Has he the skills? " + levelOfExp;
    }
}