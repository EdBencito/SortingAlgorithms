package com.sparta.algorithms;

import com.sparta.stopwatch.Stopwatch;

import java.util.List;

public class BinaryTreeSort<T extends Comparable<? super T>> implements Sortable<T> {
    Stopwatch stopwatch = new Stopwatch();

    //  Nested Class with left and right child of current node and value in index
    public class Node {
        T key;
        Node left, right;

        public Node(T item) {
            key = item;
            left = right = null;
        }
    }

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTreeSort() {
        root = null;
    }

    public void insert(T key) {
        root = insertRec(root, key);
        setRoot(root);
    }

    public Node insertRec(Node root, T key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);
        setRoot(root);
        return root;
    }

    private int j = 0;
    private T[] arraysorted;
    private double time;

    public T[] getArraysorted() {
        return arraysorted;
    }

    public void setArraysorted(T[] arraysorted) {
        this.arraysorted = arraysorted;
    }

    public void inorderRecA(Node root) {
        if (root != null) {
            inorderRecA(root.left);

            System.out.print(root.key + ", "); // PRINT OUT EACH ELEMENT IN ORDER

//            arraysorted[j] = root.key;
//            j++;
//            setArraysorted(arraysorted);
            inorderRecA(root.right);
        }
        setArraysorted(arraysorted);
//        System.out.print("Quick Sort Completed in: ");
//        stopwatch.calculatetime(time);
//        System.out.print(" Milliseconds \n");

    }

    @Override
    public T[] sort(T[] a) {
//        time = System.nanoTime();
        arraysorted = a;
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
        return null;
    }
//  TREE SORT FOR LISTS

    public void inorderRecL(Node root) {
        if (root != null) {
            inorderRecL(root.left);
//            System.out.println(root.key + " "); // PRINT OUT EACH ELEMENT IN ORDER
            System.out.print(root.key + ", "); // PRINT OUT EACH ELEMENT IN ORDER

//            j++;
            inorderRecL(root.right);
        }
//        setListsorted(listsorted);
//        System.out.print("Quick Sort Completed in: ");
//        stopwatch.calculatetime(time);
//        System.out.print(" Milliseconds \n");
    }


    @Override
    public List<T> sort(List<T> a) {
//        time = System.nanoTime();
        listsorted = a;
        for (int i = 0; i < a.size(); i++) {
            insert(a.get(i));
        }
        return null;
    }


    private List<T> listsorted;

    public List<T> getListsorted() {
        return listsorted;
    }

    public void setListsorted(List<T> listsorted) {
        this.listsorted = listsorted;
    }


}
