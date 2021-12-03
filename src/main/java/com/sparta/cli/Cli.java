package com.sparta.cli;

import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Cli {
    private static int algo;
    private static int dat;

    BubbleSort b = new BubbleSort();
    QuickSort q = new QuickSort();
    GenerateArray ar = new GenerateArray();
    GenerateArrayList arl = new GenerateArrayList();

    public int algorithmSelect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select an Algorithm" + "\n" + "'1' for Bubble Sort" + "\n" + "'2' for Quick Sort ");
        try {
            algo = Integer.parseInt(input.nextLine().trim());
            switch (algo) {
                case (1):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Bubble Sort Selected" + "\n");
                    break;
                case (2):
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Quick Sort" + "\n");
                    break;
                default:
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Option not Available" + "\n");
                    algorithmSelect();

            }
        } catch (NumberFormatException e) {
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "Error: Please Insert a Valid Input" + "\n");
//            e.printStackTrace();
            algorithmSelect();
        }
        return algo;
    }

    public int dataStrctureSelect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select a Data Type " + "\n" + "'1' for Array" + "\n" + "'2' for Array List ");

        try {
            dat = Integer.parseInt(input.nextLine().trim());
            switch (dat) {
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
//            e.printStackTrace();
            dataStrctureSelect();
        }
        return dat;
    }

    public void confirmSelection() {
        if (algo == 1 && dat == 1) {
            System.out.println("Bubble Sort on Array Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + Arrays.toString(b.sort(ar.generate(10000)))); // Working
        } else if (algo == 1 && dat == 2) {
            System.out.println("Bubble Sort on Array List Selected" + "\n");
            System.out.println("Bubble Sort Complete:" + b.sort(arl.generate(10000)));
        } else if (algo == 2 && dat == 1) {
            System.out.println("Quick Sort on Array Selected" + "\n");
            System.out.println("Quick Sort (Hoare partition Scheme) Complete:" + Arrays.toString(q.sort(ar.generate(10000)))); // Working
        } else if (algo == 2 && dat == 2) {
            System.out.println("Quick Sort on Array List Selected" + "\n");
            System.out.println("Quick Sort Complete:" + q.sort(arl.generate(10000)));


        }
    }

}
