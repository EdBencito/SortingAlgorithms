package com.sparta.algorithms;

import com.sparta.Stopwatch;

import java.util.List;

//public class BubbleSort implements Sortable {
public class BubbleSort<T extends Comparable<? super T>> implements Sortable<T> {
    Stopwatch stopwatch = new Stopwatch();
    @Override
    public T[] sort(T[] a) {
        double time = System.nanoTime();
        T arraySorted[] = a;
        T n1;
        T n2;
        for (int i = 0; i < arraySorted.length; i++) {
            for (int j = 0; j < arraySorted.length - i - 1; j++)
                try {
                    if (arraySorted[j].compareTo(arraySorted[j + 1]) > 0) {
                        n1 = arraySorted[j];
                        n2 = arraySorted[j + 1];
                        arraySorted[j] = n2;
                        arraySorted[j + 1] = n1;
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.print("Bubble Sort Completed in: ");
                    stopwatch.calculatetime(time);
                    System.out.print(" Milliseconds \n");
                    e.printStackTrace();
                }
        }
        System.out.print("Bubble Sort Completed in: ");
        stopwatch.calculatetime(time);
        System.out.print(" Milliseconds \n");
        return arraySorted;
    }

    @Override
    public List<T> sort(List<T> a) {
        double time = System.nanoTime();
        List<T> listSorted = a;
        T n1;
        T n2;
        for (int i = 0; i < listSorted.size(); i++) {
            for (int j = 0; j < listSorted.size() - i - 1; j++)
                try {
                    if (listSorted.get(j).compareTo(listSorted.get(j + 1)) > 0) {
                        n1 = listSorted.get(j);
                        n2 = listSorted.get(j + 1);
                        listSorted.set(j, n2);
                        listSorted.set(j + 1, n1);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.print("Bubble Sort Completed in: ");
                    stopwatch.calculatetime(time);
                    System.out.print(" Milliseconds \n");
                    e.printStackTrace();
                }
        }
        System.out.print("Bubble Sort Completed in: ");
        stopwatch.calculatetime(time);
        System.out.print(" Milliseconds \n");
        return listSorted;
    }


}
