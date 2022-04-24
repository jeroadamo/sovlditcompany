package solvd.itcompany.person;

public abstract class Employee extends Person {
    private int salary;

    public Employee(String name, int id, int age) {
        super(name, id, age);

    }

    public Employee(int salary, String name, int id, int age) {
        super(name, id, age);
        this.salary = salary;

    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return
                "This is= " + getName() + " His EmployeeId is: " + getId();
    }
}