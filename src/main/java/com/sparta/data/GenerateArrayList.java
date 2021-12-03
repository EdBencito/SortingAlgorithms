package com.sparta.data;

import java.util.ArrayList;

public class GenerateArrayList {
    private ArrayList<Integer> alistAS;

    public ArrayList<Integer> generate(int size) {
        alistAS = new ArrayList<>();
        for (int i = 0; i < size; i++) {  // Random generation of numbers
            alistAS.add(new java.util.Random().nextInt(0, 10000));
        }
        setalistAS(alistAS);
        return alistAS;
    }

    public ArrayList<Integer> staticarraylist(int size){
        alistAS = new ArrayList<>();
        for (int i = 0; i < size;i++){
            alistAS.add(i);
        }
        return alistAS;
    }

    public ArrayList<Integer> getalistAS() {
        return alistAS;
    }

    public void setalistAS(ArrayList listA) {
        this.alistAS = listA;
    }
}
