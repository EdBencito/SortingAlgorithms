package com.sparta.data;

import java.util.ArrayList;

public class GenerateArrayList {
    private ArrayList<Integer> alistAS;
    private ArrayList<Character> alistASC;

    public ArrayList<Integer> generate(int size) {
        alistAS = new ArrayList<>();
        for (int i = 0; i < size; i++) {  // Random generation of numbers
            alistAS.add(new java.util.Random().nextInt(0, 100000));
        }
        setalistAS(alistAS);
        return alistAS;
    }

    public ArrayList<Character> generateC(int size) {
        alistASC = new ArrayList<>();
        for (int i = 0; i < size; i++) {  // Random generation of numbers
            alistASC.add((char)new java.util.Random().nextInt(65, 91));
        }
        setAlistASC(alistASC);
        return alistASC;
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

    public ArrayList<Character> getAlistASC() {
        return alistASC;
    }

    public void setAlistASC(ArrayList<Character> alistASC) {
        this.alistASC = alistASC;
    }
}
