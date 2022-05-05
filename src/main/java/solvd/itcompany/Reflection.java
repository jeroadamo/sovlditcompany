package solvd.itcompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.person.Customer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflection {
    private final static Logger LOGGER = LogManager.getLogger(Reflection.class);

    public static void main(String[] args) {
        Customer customer = new Customer("Pablo", 211354, 20);
        Constructor[] cons = Customer.class.getDeclaredConstructors();
        cons[0].getParameters();
        try {
            Field fieldFirst = customer.getClass().getDeclaredField("username");
            fieldFirst.getModifiers();
        } catch (NoSuchFieldException e) {
        }
        Field[] fields = customer.getClass().getDeclaredFields();
        fields[0].getModifiers();

        try {
            Method m = customer.getClass().getDeclaredMethod("get" + fields[0].getName().charAt(0));
            Parameter[] p = m.getParameters();

        } catch (NoSuchMethodException e) {

        }

    }

}