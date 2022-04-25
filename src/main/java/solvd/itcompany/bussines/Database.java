package solvd.itcompany.bussines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.codeable.GitHub;
import solvd.itcompany.person.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private final static Logger LOGGER = LogManager.getLogger(Database.class);
    private ArrayList<Application> applications;
    private HashMap<String, String> passwords;
    public Database(ArrayList<Application> applications, HashMap<String, String> passwords){
        this.applications = applications;
        this.passwords = passwords;
    }
    public Database(){
        this.applications = new ArrayList<Application>();
        this.passwords = new HashMap<String, String>();
    }

    public ArrayList<Application> getApplications(){return applications;}

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }

    public void ongoingProjects(GitHub addedToGitProjects) {
        LOGGER.info("This " + addedToGitProjects.name() + " has been added to GitHub for further development.");
    }

    @Override
    public String toString(){
        return "This has been the applications from the company: " + applications;
    }

    public HashMap<String, String> getPasswords() {
        return passwords;
    }

    public void setPasswords(HashMap<String, String> passwords) {
        this.passwords = passwords;
    }

    public void printPasswords(){
        LOGGER.info(passwords);
    }

    public void printAppsDeveloped(){
        LOGGER.info(applications);
    }
}
