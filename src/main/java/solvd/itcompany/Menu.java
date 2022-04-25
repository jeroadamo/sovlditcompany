package solvd.itcompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.bussines.Budget;
import solvd.itcompany.bussines.Database;
import solvd.itcompany.bussines.IAdd;
import solvd.itcompany.codeable.Gadget;
import solvd.itcompany.codeable.Game;

import solvd.itcompany.codeable.GitHub;
import solvd.itcompany.exceptions.CannotWorkException;
import solvd.itcompany.exceptions.FiredException;
import solvd.itcompany.exceptions.NotEnoughBudgetException;
import solvd.itcompany.exceptions.NotEnoughExperienceException;
import solvd.itcompany.person.*;


public class Menu {
    private final static Logger LOGGER = LogManager.getLogger(Menu.class);

    public static void main(String[] args) {


        Customer c1 = new Customer("baldo_1", 625, "Basilio Hollaward", 23767547, 19);
        Customer c2 = new Customer("vainillo", 1029, "George Camper", 17596211, 27);
        Customer c3 = new Customer("campel", 200, "Carl Addams", 6897224, 48);

        c1.setUsername("basillio1");
        c1.setBudget(678);


        SeniorDev sd1 = new SeniorDev("Available for more work", true, "Johan", 16223457, 29, 2500);
        SeniorDev sd2 = new SeniorDev("Unavailable for work", true, "Paul", 15998457, 31, 2500);
        sd1.workerInActivity(false);

        JuniorDev jd1 = new JuniorDev("Unavailable for work", false, "Peter", 18326454, 25, 1500);
        jd1.workerInActivity(true);

        //Company.addSeniorDev("Avilable for work", true, "Carl", 12789456, 35, 2500);
        try {
            jd1.canDoIt(jd1);
        } catch (NotEnoughExperienceException a) {
            LOGGER.error(a);
        }

        Game game1 = new Game(1500, "Game", "Moba", 15, 0.00, true, "Easy");
        Game game2 = new Game(200, "Game", "Fps", 30, 15.5, false, "Impossible");

        game1.setDificulty("Hard");
        game1.installation(false, "Customer's computer");

        try {
            c1.requestAppDevelopment(game1);
        } catch (NotEnoughBudgetException e) {
            LOGGER.error(e);
        }

        Gadget gdg1 = new Gadget(25, "Gadget", "ClockApp", 3, true, false);
        Gadget gdg2 = new Gadget(25, "Gadget", "WeatherApp", 3, false, true);
        gdg2.installation(false, "Customer's Phone");


        jd1.assignment(true, game1);

        QualityAssurancer qa1 = new QualityAssurancer(750, "Peter", 2238465, 26);
        qa1.testing(gdg2, qa1, false);
        qa1.testing(game2, qa1, true);

        gdg2.testing(gdg2, qa1, true);

        try {
            sd1.frustration(sd1, false);
        } catch (CannotWorkException e) {
            LOGGER.error(e);
        }
        try {
            sd2.frustration(sd2, true);
        } catch (CannotWorkException e) {
            LOGGER.error(e);
        }
        try {
            jd1.frustration(jd1, true);
        } catch (CannotWorkException e) {
            LOGGER.error(e);
        }

        Database database = new Database();

        database.getApplications().add(game1);
        database.getApplications().add(game2);
        database.getApplications().add(gdg1);
        database.printAppsDeveloped();

        database.getPasswords().put(c1.getusername(), "password12");
        database.getPasswords().put(c2.getusername(), "password66" );
        database.printPasswords();

        GitHub game1Git = GitHub.MOBA1;
        database.ongoingProjects(GitHub.MOBA1);
        database.ongoingProjects(GitHub.CLOCKAPP1);

        c1.ideas();

        Writer w1 = new Writer("Paul Berrywitt", 7895621, 40);
        try {
            w1.writing(c1.ideas());
        } catch (FiredException e) {
            LOGGER.error(e);
        }


        Budget budget = new Budget(450000);


        IAdd add = (a, b) -> Integer.sum(a, b);

        budget.setCompanyBudget(add.addition(budget.getCompanyBudget(), game1.getBasicPrice()));
        budget.setCompanyBudget(add.addition(budget.getCompanyBudget(), game2.getBasicPrice()));
        budget.setCompanyBudget(add.addition(budget.getCompanyBudget(), gdg1.getBasicPrice()));

        LOGGER.info("This app moneymade has been added to the company budget! Company's savings rise now to: "+ budget );



    }
}
