package com.sparta.data;

public class GenerateArray {
    private Comparable[] arrayAS;

    public Comparable[] generate(int size) {
        Comparable arrayA[] = new Comparable[size];
        for (int i = 0; i < size; i++) {  // Random generation of numbers
            arrayA[i] = new java.util.Random().nextInt(0, 100000);
        }
        setArrayAS(arrayA);
        return arrayA;
    }

    public int[] staticarrayA() {
        int x[] = {5, 4, 3, 2, 1};
        return x;
    }

    public int[] staticarrayB() {
        int y[] = {5, 4, 3, 2, 1};
        return y;
    }

    public Comparable[] getArrayAS() {
        return arrayAS;
    }

    public void setArrayAS(Comparable[] arrayAS) {
        this.arrayAS = arrayAS;
    }
}
