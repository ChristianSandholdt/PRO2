package Opgave3.Architecture1stSem.gui;

import Opgave3.Architecture1stSem.controller.Controller;
import Opgave3.Architecture1stSem.controller.Storage;
import Opgave3.Architecture1stSem.model.Company;
import Opgave3.Architecture1stSem.model.Employee;
import Opgave3.Architecture1stSem.storage.ListStorage;
import javafx.application.Application;

public class ArchitectureApp {

    public static void main(String[] args) {
        Storage storage = ListStorage.loadStorage();
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage created");
        }
        Controller.setStorage(storage);

        Application.launch(ArchitectureGui.class);
    }

}
