package com.sparta.algorithms;

import com.sparta.stopwatch.Stopwatch;

import java.util.List;

//public class QuickSort implements Sortable {
public class QuickSort<T extends Comparable<? super T>> implements Sortable <T> {
    Stopwatch stopwatch = new Stopwatch();
    @Override
    public T[] sort(T[] a) {
        double time = System.nanoTime();
        sortA(a, 0, a.length - 1);
        System.out.print("Quick Sort Completed in: ");
        stopwatch.calculatetime(time);
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
            } while (arraySorted[l].compareTo(pivot)<0);
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
    public List<T> sort(List<T> a) {
        double time = System.nanoTime();
        sortA(a, 0, (a.size() - 1));
        System.out.print("Quick Sort Completed in: ");
        stopwatch.calculatetime(time);
        System.out.print(" Milliseconds \n");
        return a;
    }

    public List<T> sortA(List<T> a, int lo, int hi) {

        List<T> listSorted = a;

        if (lo >= 0 && hi >= 0 && lo < hi) {

            int p = partition(listSorted, lo, hi);
            sortA(listSorted, lo, p);
            sortA(listSorted, p + 1, hi);
        }
        return listSorted;
    }

    public int partition(List<T> a, int lo, int hi) {
        T i;

        List<T> listSorted = a;
//        int pivot = a.get((int) Math.floor((hi + lo) / 2)); // Partition
        T pivot = a.get((int) Math.floor((hi + lo) / 2)); // Partition
        int l = lo - 1; // Left Index
        int r = hi + 1; // Right Index

        while (true) {
            do {
                l++;
            } while (listSorted.get(l).compareTo(pivot) < 0);
            do {
                r--;
            } while (listSorted.get(r).compareTo(pivot) > 0);

            if (l >= r) {
                return r;
            }

            i = listSorted.get(l);
            listSorted.set(l, listSorted.get(r));
            listSorted.set(r, i);
        }
    }
}




