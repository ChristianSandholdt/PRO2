package Opgave3.Architecture1stSem.controller;

import Opgave3.Architecture1stSem.model.Company;
import Opgave3.Architecture1stSem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface Storage {

    List<Company> companies = new ArrayList<>();

    List<Employee> employees = new ArrayList<>();

    ArrayList<Employee> getEmployees();

    static void storeEmployee(Employee employee) {
    }

    static void deleteEmployee(Employee employee){
    }

    void storeCompany(Company company);

    void deleteCompany(Company company);

    ArrayList<Company> getCompanies();

}
