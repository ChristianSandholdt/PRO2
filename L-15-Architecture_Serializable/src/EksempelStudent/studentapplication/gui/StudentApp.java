package EksempelStudent.studentapplication.gui;

import javafx.application.Application;
import EksempelStudent.studentapplication.controller.Controller;
import EksempelStudent.studentapplication.controller.Storage;
import EksempelStudent.studentapplication.storage.ListStorage;

public class  StudentApp {

    public static void main(String[] args) {
        Storage storage = ListStorage.loadStorage();
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage created");
        }
        Controller.setStorage(storage);

        Application.launch(StudentGui.class);
    }


}