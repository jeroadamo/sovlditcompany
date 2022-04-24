package solvd.itcompany.person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.Menu;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.exceptions.CannotWorkException;
import solvd.itcompany.exceptions.NotEnoughExperienceException;

public class JuniorDev extends Employee implements IWork, IGetAssigned, IGetFrustrated {
    private final static Logger LOGGER = LogManager.getLogger(Menu.class);
    private String can;
    private boolean levelOfExp;

    public JuniorDev(String name, int id, int age) {
        super(name, id, age);

    }

    public JuniorDev(String can, boolean levelOfExp, String name, int id, int age, int salary) {
        super(name, id, age);
        this.can = can;
        this.levelOfExp = levelOfExp;
    }

    public void canDoIt(JuniorDev proy) throws NotEnoughExperienceException {
        if (proy.levelOfExp == false) {
            throw new NotEnoughExperienceException("This developer will not be able to resolve this task");
        }
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
    public void workerInActivity(boolean working) {
        if (working) {
            LOGGER.info("This JuniorDev is Working!");
        } else {
            LOGGER.info("This JuniorDev is in his/her break");
        }
    }


    @Override
    public String toString() {
        return "this junior dev: " +
                "has to much work?=" + can +
                ", will he avialable to do it?=" + levelOfExp;
    }



    @Override
    public void assignment(boolean assigned, Application project) {
        if (assigned){
            LOGGER.info("This dev is now working on "+ project);
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
            LOGGER.info("This dev is O-K!");
        }
    }
}
