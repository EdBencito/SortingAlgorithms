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

    public Comparable[] generateC(int size) {
        Comparable arrayA[] = new Comparable[size];
        for (int i = 0; i < size; i++) {  // Random generation of numbers
            arrayA[i] = (char) new java.util.Random().nextInt(65, 91);
        }
        setArrayAS(arrayA);
        return arrayA;
    }

    public Comparable[] staticarrayA() {
        Comparable x[] = {5, 4, 3, 2, 1};
        return x;
    }

    public Comparable[] staticarrayB() {
        Comparable y[] = {5, 4, 3, 2, 1};
        return y;
    }

    public Comparable[] getArrayAS() {
        return arrayAS;
    }

    public void setArrayAS(Comparable[] arrayAS) {
        this.arrayAS = arrayAS;
    }
}
