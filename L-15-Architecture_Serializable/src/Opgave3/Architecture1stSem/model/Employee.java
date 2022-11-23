package Opgave3.Architecture1stSem.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int wage; // hourly wage

    // association 0..* --- 0..1 Company
    Company company; // nullable, OBS: package visible

    /** Pre: name not empty, wage >= 0. */
    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    /** Pre: name not empty. */
    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    /** Pre: wage >= 0. */
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + " (kr " + wage + ")";
    }

    // -----------------------------------------------------------------------------

    /** Note: Nullable return value. */
    public Company getCompany() {
        return company;
    }

    // -----------------------------------------------------------------------------

    /**
     * Return the weekly salary of this employee.
     * Return 0, if this employee does not have a company.
     */
    public int weeklySalary() {
        int salary = 0;
        if (company != null) {
            salary = wage * company.getHours();
        }
        return salary;
    }
}
