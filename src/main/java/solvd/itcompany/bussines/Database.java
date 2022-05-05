package solvd.itcompany.bussines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.itcompany.codeable.Application;
import solvd.itcompany.codeable.GitHub;
import solvd.itcompany.person.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class Database {
    private final static Logger LOGGER = LogManager.getLogger(Database.class);
    private ArrayList<Application> applications;
    private HashMap<String, String> passwords;

    private LinkedList<Employee> employees;

    public Database(ArrayList<Application> applications, HashMap<String, String> passwords, LinkedList<Employee> employees) {
        this.applications = applications;
        this.passwords = passwords;
        this.employees = employees;
    }

    public Database() {
        this.applications = new ArrayList<Application>();
        this.passwords = new HashMap<String, String>();
        this.employees = new LinkedList<Employee>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }

    public void ongoingProjects(GitHub addedToGitProjects) {
        LOGGER.info("This " + addedToGitProjects.name() + " has been added to GitHub for further development.");
    }

    @Override
    public String toString() {
        return "This has been the applications from the company: " + applications;
    }

    public HashMap<String, String> getPasswords() {
        return passwords;
    }

    public void setPasswords(HashMap<String, String> passwords) {
        this.passwords = passwords;
    }

    public void printPasswords() {
        LOGGER.info(passwords);
    }

    public void printAppsDeveloped() {
        LOGGER.info(applications);
    }

    public void filter() {
        applications.stream().filter(x -> x.getBasicPrice() > 10).forEach(app -> LOGGER.info(app));
    }

    public void sort() {
        applications.stream().sorted(Comparator.comparingInt(x -> x.getBasicPrice())).forEach(app -> LOGGER.info(app));
    }

    public void addApp(Application app) {
        applications.add(app);
    }

    public void addUserAndPassword(String user, String password) {
        passwords.put(user, password);
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    public void removeEmployee(int index, Employee employee) {
        employees.remove();
    }
}
