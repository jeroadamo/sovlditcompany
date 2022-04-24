package solvd.itcompany.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.codeable.ITest;

public class QualityAssurancer extends Employee implements ITest {
    private final static Logger LOGGER = LogManager.getLogger(QualityAssurancer.class);


    public QualityAssurancer(int salary, String name, int id, int age) {
        super(salary, name, id, age);
    }

    @Override
    public void testing(Application app, QualityAssurancer qa, boolean passedCheck) {
       LOGGER.info("This qa just tested this app ");
       if(passedCheck){
           LOGGER.info("and it works just fine!");}
       else{
           LOGGER.info("and it needs to be fixed.");
           }
       }
    }

