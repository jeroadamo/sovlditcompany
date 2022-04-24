package solvd.itcompany.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.exceptions.FiredException;

import java.util.Random;
import java.util.Scanner;


public class Writer extends Employee {
    private final static Logger LOGGER = LogManager.getLogger(Customer.class);

    public Writer(String name, int id, int age) {
        super(name, id, age);
    }


    public void writing (String idea) throws FiredException {
        if(roll()){
            LOGGER.info("The Writers came up with a great script for your game! Congratulations, you game will be a success");
        } else{
            LOGGER.info("The writers couldn't came up with anything inspiring");
            LOGGER.info("Press 1 to try again. Choose not to and there will be consequences!");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() ==1)
            {
                writing(idea);
            }
            else throw new FiredException("You have published a game that will not sell, and lose the company money." +
                    " This writer is FIRED!");



        }
    }
    public boolean roll(){
        Random rand = new Random();
        int die1 = rand.nextInt(6);
        int die2 = rand.nextInt(6);
        return die1 == die2;

    }
}