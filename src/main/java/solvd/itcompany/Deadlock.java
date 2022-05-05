package solvd.itcompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Deadlock {
    public static void main(String[] args) {
        final Logger LOGGER = LogManager.getLogger(Deadlock.class);
        final String serverFive = "Fifth Server...";
        final String serverSix = "Sixth Server...";
        Runnable r1 = () -> {
            synchronized (serverFive) {
                LOGGER.info(Thread.currentThread().getName() + " Can't initialize " + serverFive);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                }
                synchronized (serverSix) {
                    LOGGER.info(Thread.currentThread().getName() + " Can't initialize " + serverSix);
                }
            }
        };
        Runnable r2 = () -> {
            synchronized (serverSix) {
                LOGGER.info(Thread.currentThread().getName() + " Can't initialize " + serverSix);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                }
                synchronized (serverFive) {
                    LOGGER.info(Thread.currentThread().getName() + " Can't initialize " + serverFive);
                }
            }
        };

        Thread t1 = new Thread(r1);
        t1.setName("Main Server");
        Thread t2 = new Thread(r2);
        t2.setName("Main server");
        t1.start();
        t2.start();
    }
}