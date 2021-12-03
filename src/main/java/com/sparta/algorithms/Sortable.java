package com.sparta.algorithms;

import java.util.List;

//public interface Sortable {
public interface Sortable<T extends Comparable<? super T>> {

    public T[] sort(T a[]);
    public List<T> sort(List<T> a);

}