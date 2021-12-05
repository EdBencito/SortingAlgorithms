package com.sparta.cli;

import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Cli {
    private static Logger l = LogManager.getLogger("Sorting Algorithms");
    private static int algo;
    private static int datastructure;
    private static int datatype;

    BubbleSort b = new BubbleSort();
    QuickSort q = new QuickSort();
    GenerateArray ar = new GenerateArray();
    GenerateArrayList arl = new GenerateArrayList();

    public int algorithmSelect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select an Algorithm" + "\n" + "'1' for Bubble Sort" + "\n" + "'2' for Quick Sort "
                + "\n" + "'3' for Binary Tree Sort ");
        try {
            algo = Integer.parseInt(input.nextLine().trim());
            switch (algo) {
                case (1):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Bubble Sort Selected" + "\n");
                    break;
                case (2):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Quick Sort Selected" + "\n");
                    break;
                case (3):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Binary Tree Sort Selected" + "\n");
                    break;
                default:
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Option not Available" + "\n");
                    algorithmSelect();

            }
        } catch (NumberFormatException e) {
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Please Insert a Valid Input" + "\n");
            l.log(Level.ERROR, e);
            l.error("Exception Thrown");
//            e.printStackTrace();
            algorithmSelect();
        }
        return algo;
    }

    public int dataStrctureSelect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select a Data Structure" + "\n" + "'1' for Array" + "\n" + "'2' for Array List ");

        try {
            datastructure = Integer.parseInt(input.nextLine().trim());
            switch (datastructure) {
                case (1):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Array Selected" + "\n");
                    break;
                case (2):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Array List Selected" + "\n");
                    break;
                default:
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Option not Available" + "\n");
                    dataStrctureSelect();
            }

        } catch (NumberFormatException e) {
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Please Insert a Valid Input" + "\n");
            l.log(Level.ERROR, e);
            l.error("Exception Thrown");
//            e.printStackTrace();
            dataStrctureSelect();
        }
        return datastructure;
    }

    public int dataTypeSelect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select a Data Type" + "\n" + "'1' for Integers" + "\n" + "'2' for Characters ");

        try {
            datatype = Integer.parseInt(input.nextLine().trim());
            switch (datatype) {
                case (1):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Integers Selected" + "\n");
                    break;
                case (2):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Characters Selected" + "\n");
                    break;
                default:
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Option not Available" + "\n");
                    dataStrctureSelect();
            }

        } catch (NumberFormatException e) {
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Please Insert a Valid Input" + "\n");
            l.log(Level.ERROR, e);
            l.error("Exception Thrown");
//            e.printStackTrace();
            dataStrctureSelect();
        }
        return datatype;
    }

    public void confirmSelection() {
        if (algo == 1 && datastructure == 1 && datatype == 1) {
            System.out.println("Bubble Sort on Array with Randomly Generated Integers Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + Arrays.toString(b.sort(ar.generate(10000)))); // Working
        } else if (algo == 1 && datastructure == 1 && datatype == 2) {
            System.out.println("Bubble Sort on Array with Randomly Generated Characters Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + Arrays.toString(b.sort(ar.generateC(10000))));
        } else if (algo == 1 && datastructure == 2 && datatype == 1) {
            System.out.println("Bubble Sort on Array List with Randomly Generated Integers Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + b.sort(arl.generate(10000)));
        } else if (algo == 1 && datastructure == 2 && datatype == 2) {
            System.out.println("Bubble Sort on Array List with Randomly Generated Characters Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + b.sort(arl.generateC(10000)));
        } else if (algo == 2 && datastructure == 1 && datatype == 1) {
            System.out.println("Quick Sort on Array with Randomly Generated Integers Selected" + "\n");
            System.out.println("Quick Sort (Hoare partition Scheme) Complete:" + Arrays.toString(q.sort(ar.generate(10000)))); // Working
        } else if (algo == 2 && datastructure == 1 && datatype == 2) {
            System.out.println("Quick Sort on Array with Randomly Generated Characters Selected" + "\n");
            System.out.println("Quick Sort Complete:" + Arrays.toString(q.sort(ar.generateC(10000))));
        } else if (algo == 2 && datastructure == 2 && datatype == 1) {
            System.out.println("Quick Sort on Array List with Randomly Generated Integers Selected" + "\n");
            System.out.println("Quick Sort Complete:" + q.sort(arl.generate(10000)));
        } else if (algo == 2 && datastructure == 2 && datatype == 2) {
            System.out.println("Quick Sort on Array List with Randomly Generated Characters Selected" + "\n");
            System.out.println("Quick Sort Complete:" + Arrays.toString(q.sort(ar.generateC(10000))));
        }
    }

}
