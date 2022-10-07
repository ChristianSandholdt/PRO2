package Opgave3.Architecture1stSem.storage;

import Opgave3.Architecture1stSem.controller.Storage;
import Opgave3.Architecture1stSem.model.Company;
import Opgave3.Architecture1stSem.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage, Serializable {
    private final List<Company> companies = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();

    public ArrayList<Company> getCompanies(){
        return new ArrayList<>(companies);
    }
    @Override
    public void storeCompany(Company company) {
        companies.add(company);
    }
    @Override
    public void deleteCompany(Company company) {
        companies.remove(company);
    }
    // ------------------------------------------------------------



    public ArrayList<Employee> getEmployees(){
        return new ArrayList<>(employees);
    }

    public static ListStorage loadStorage() {
        String fileName = "L-15-Architecture_Serializable/src/Opgave3/Architecture1stSem/Test/StorageFil.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            System.out.println("Storage loaded from file " + fileName);
            return storage;
        } catch (IOException e) {
            System.out.println("Error reading file");
            System.out.println(e);
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Class of serialized objects not found");
            System.out.println(e);
            return null;
        }
    }

    public static void saveStorage(Storage storage) {
        String fileName = "L-15-Architecture_Serializable/src/Opgave3/Architecture1stSem/Test/StorageFil.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
           objOut.writeObject(storage);
            System.out.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error writing file " + fileName);
            System.out.println(ex);
            throw new RuntimeException();
        }
    }



}
