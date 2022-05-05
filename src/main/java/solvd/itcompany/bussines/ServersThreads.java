package solvd.itcompany.bussines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServersThreads extends Thread {
    private final static Logger LOGGER = LogManager.getLogger(ServersThreads.class);

    @Override
    public void run() {
        LOGGER.info("Server Initializing...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        LOGGER.info("Server Initialized");
    }

}
