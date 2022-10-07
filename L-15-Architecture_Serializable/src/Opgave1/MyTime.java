package Opgave1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {

    private int time = 0;

    private List<String> times = new ArrayList<>();

    public MyTime(int time){
        this.time = 0;
    }
    public int increase(){
        return time++;
    }

    public int reset(){
        return time = 0;
    }

    public int getTime(){
        return time;
    }

    public void add(MyTime time){
        times.add(time+"");
    }

    public List<String> getTimes(){
        return new ArrayList<>(times);
    }

}


