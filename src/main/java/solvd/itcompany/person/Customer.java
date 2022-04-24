package solvd.itcompany.person;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.exceptions.NotEnoughBudgetException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Customer extends Person {
    private final static Logger LOGGER = LogManager.getLogger(Customer.class);
    private String username;
    private int budget;


    public Customer(String name, int id, int age) {
        super(name, id, age);
    }

    public Customer(String username, int budget, String name, int id, int age) {
        super(name, id, age);
        this.username = username;
        this.budget = budget;
    }

    public void requestAppDevelopment(Application app) throws NotEnoughBudgetException {
        if (app.getBasicPrice() > this.budget) {
            throw new NotEnoughBudgetException("Not Enough Budget");
        }
    }

    public String getusername() {
        return username;
    }

    public int budget() {
        return budget;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String ideas() {
        List<String> givenList = Arrays.asList("Dragons!", "Detectives!", "Assassins...", "Post Apocalyptic!");
        Random rand = new Random();
        String randomElement = givenList.get(rand.nextInt(givenList.size()));
        LOGGER.info(randomElement);
        return randomElement;

    }



    @Override
    public String toString() {
        return "welcome: " + username +
                "this is your budget" + budget;
    }

}