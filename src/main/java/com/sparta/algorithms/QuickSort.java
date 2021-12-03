package com.sparta.algorithms;

import java.util.List;

//public class QuickSort implements Sortable {
public class QuickSort<T extends Comparable<? super T>> implements Sortable <T> {

    @Override
    public T[] sort(T[] a) {
        double time = System.nanoTime();
        sortA(a, 0, a.length - 1);
        System.out.print("Quick Sort Completed in: ");
        time = System.nanoTime() - time;
        time = time / 1000000;
        System.out.print(Double.toString(time).substring(0, Double.toString(time).length() - 3));
        System.out.print(" Milliseconds \n");
        return a;
    }

    public T[] sortA(T[] a, int lo, int hi) {
        T arraySorted[] = a;

        if (lo >= 0 && hi >= 0 && lo < hi) {

            int p = partition(arraySorted, lo, hi);
            sortA(arraySorted, lo, p);
            sortA(arraySorted, p + 1, hi);
        }
        return arraySorted;
    }

    public int partition(T a[], int lo, int hi) {
        T i;

        T arraySorted[] = a;
        T pivot = a[(int) Math.floor((hi + lo) / 2)]; // Partition
        int l = lo - 1; // Left Index
        int r = hi + 1; // Right Index

        while (true) {
            do {
                l++;
            } while (arraySorted[l].compareTo(pivot)<=0);
            do {
                r--;
            } while (arraySorted[r].compareTo(pivot) > 0);

            if (l >= r) {
                return r;
            }

            i = arraySorted[l];
            arraySorted[l] = arraySorted[r];
            arraySorted[r] = i;
        }
    }

    @Override
    public List sort(List a) {
        double time = System.nanoTime();
        sortA(a, 0, (a.size() - 1));
        System.out.print("Quick Sort Completed in: ");
        time = System.nanoTime() - time;
        time = time / 1000000;
        System.out.print(Double.toString(time).substring(0, Double.toString(time).length() - 3));
        System.out.print(" Milliseconds \n");
        return a;
    }

    public List<Integer> sortA(List<Integer> a, int lo, int hi) {

        List<Integer> listSorted = a;

        if (lo >= 0 && hi >= 0 && lo < hi) {

            int p = partition(listSorted, lo, hi);
            sortA(listSorted, lo, p);
            sortA(listSorted, p + 1, hi);
        }
        return listSorted;
    }

    public int partition(List<Integer> a, int lo, int hi) {
        int i = 0;

        List<Integer> listSorted = a;
        int pivot = a.get((int) Math.floor((hi + lo) / 2)); // Partition
        int l = lo - 1; // Left Index
        int r = hi + 1; // Right Index

        while (true) {
            do {
                l++;
            } while (listSorted.get(l) < pivot);
            do {
                r--;
            } while (listSorted.get(r) > pivot);

            if (l >= r) {
                return r;
            }

            i = listSorted.get(l);
            listSorted.set(l, listSorted.get(r));
            listSorted.set(r, i);
        }
    }
}




