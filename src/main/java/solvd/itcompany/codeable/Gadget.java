package solvd.itcompany.codeable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.person.QualityAssurancer;

public class Gadget extends Application implements Instalable, ITest {
    private static final Logger log = LogManager.getLogger(Gadget.class);

    private boolean forAndroid;
    private boolean internetConnection;

    public Gadget(int basicPrice, int timeTakes, boolean forAndroid, boolean internetConnection) {
        super(basicPrice, timeTakes);
        this.forAndroid = forAndroid;
        this.internetConnection = internetConnection;
    }

    public boolean getForAndroid() {
        return forAndroid;
    }

    public void setForAndroid() {
        this.forAndroid = forAndroid;
    }

    public boolean getInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection() {
        this.internetConnection = internetConnection;
    }

    @Override
    public void installation(boolean meetsRequirements, String deviceName) {
        if (meetsRequirements) {
            log.info("This gadget was installed in " + deviceName);
        } else {
            log.info("This gadget cannot be installed, our company does not support iOs opperative system.");
        }
    }

    @Override
    public void testing(Application app, QualityAssurancer qa, boolean passedCheck) {
        log.info("This qa just tested this app ");
        if (passedCheck) {
            log.info("and it works just fine!");
        } else {
            log.info("and it needs to be fixed.");
        }
    }
}
