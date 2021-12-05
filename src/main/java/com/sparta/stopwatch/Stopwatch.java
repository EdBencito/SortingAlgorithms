package com.sparta.stopwatch;

public class Stopwatch {
    public double calculatetime(double starttime){
       double endtime = System.nanoTime() - starttime;
        endtime = endtime / 1000000;
        System.out.print(Double.toString(endtime).substring(0, Double.toString(endtime).length() - 3));
        return endtime;
    }
}
