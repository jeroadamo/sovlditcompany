package solvd.itcompany.bussines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.codeable.GitHub;

import java.util.ArrayList;

public class Database {
    private final static Logger LOGGER = LogManager.getLogger(Database.class);
    private ArrayList<Application> moneyMadeFromApllications;

    public Database(ArrayList<Application> moneyMadeFromApllications){
        this.moneyMadeFromApllications = moneyMadeFromApllications;
    }
    public Database(){
        this.moneyMadeFromApllications = new ArrayList<Application>();
    }

    public ArrayList<Application> getMoneyMadeFromApllications(){return moneyMadeFromApllications;}

    public void setMoneyMadeFromApllications(ArrayList<Application> moneyMadeFromApllications) {
        this.moneyMadeFromApllications = moneyMadeFromApllications;
    }

    public void ongoingProjects(GitHub addedToGitProjects) {
        LOGGER.info("This " + addedToGitProjects.name() + " has been added to GitHub for further development.");
    }

    //public void sum()
}
