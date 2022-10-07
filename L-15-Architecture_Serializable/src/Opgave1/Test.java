package Opgave1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        MyTime mt = new MyTime(0);

//        MyTime mt = loadMyTime();
//        if (mt == null){
//            System.out.println("Storage not loaded");
//            return;
//        }

        System.out.println("Tiden er lige nu " + mt.getTime());

        mt.increase();
        mt.increase();
        mt.increase();

        System.out.println("Tiden er efter " + mt.getTime());

        saveMyTime(mt);

        saveMyTimes(mt);


        System.out.println(mt.getTimes().toString());
    }


    public static void saveMyTime(MyTime time){
        try (FileOutputStream fileOut = new FileOutputStream("FilOpgave1.ser");
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
            objOut.writeObject(time);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static MyTime loadMyTime() {
        MyTime m1;
        try (FileInputStream fileIn = new FileInputStream("FilOpgave1.ser");
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            m1 = (MyTime) objIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return m1;
    }

    public static void saveMyTimes(MyTime time){
        MyTime mt = loadMyTime();
        time.add(mt);
    }
}
