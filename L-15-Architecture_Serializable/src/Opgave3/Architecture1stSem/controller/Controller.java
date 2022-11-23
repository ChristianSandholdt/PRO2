package Opgave3.Architecture1stSem.controller;

import Opgave3.Architecture1stSem.model.Company;
import Opgave3.Architecture1stSem.model.Employee;
import Opgave3.Architecture1stSem.storage.ListStorage;

import java.util.ArrayList;

public abstract class Controller {

    private static Storage storage;

    public static Storage getStorage() {
        return storage;
    }

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        storage.storeCompany(company);
        return company;
    }

    /**
     * Delete the company.
     * Pre: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        storage.deleteCompany(company);
    }

    /**
     * Update the company.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    public static ArrayList<Company> getCompanies() {
        return storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Create a new employee.
     * Pre: name not empty, wage >= 0.
     */
    public static Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        Storage.storeEmployee(employee);
        return employee;
    }

    /**
     * Delete the employee.
     */
    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        Storage.deleteEmployee(employee);
    }

    /**
     * Update the employee.
     * Pre: wage >= 0.
     */
    public static void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }

    public static ArrayList<Employee> getEmployees() {
        return storage.getEmployees();
    }

    // -------------------------------------------------------------------------

    /**
     * Add the employee to the company.
     * If the employee is connected to another company, this connected is removed.
     */
    public static void addEmployeeToCompany(Employee employee, Company company) {
        var oldCompany = employee.getCompany();
        if (oldCompany != null) {
            oldCompany.removeEmployee(employee);
        }
        company.addEmployee(employee);
    }

    /**
     * Remove the employee's company, if the employee has a company.
     */
    public static void removeCompanyOfEmployee(Employee employee) {
        var company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
    }
}
