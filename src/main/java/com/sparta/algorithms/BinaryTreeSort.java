package com.sparta.algorithms;

import java.util.List;

public class BinaryTreeSort<T extends Comparable<? super T>> implements Sortable<T> {
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
        if (key.compareTo(root.key) <= 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);
        return root;
    }

    private int j = 0;
    private T[] arraysorted;

    public T[] getArraysorted() {
        return arraysorted;
    }

    public void setArraysorted(T[] arraysorted) {
        this.arraysorted = arraysorted;
    }

    public void inorderRecA(Node root) {
        if (root != null) {
            inorderRecA(root.left);
            arraysorted[j] = root.key;
//            System.out.println(root.key + " "); // PRINT OUT EACH ELEMENT IN ORDER
            j++;
            inorderRecA(root.right);
        }
        setArraysorted(arraysorted);
    }

    @Override
    public T[] sort(T[] a) {
        arraysorted = a;
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
        return null;
    }



    public void inorderRecL(Node root) {
        if (root != null) {
            inorderRecL(root.left);
            listsorted.set(j, root.key);
//            System.out.println(root.key + " "); // PRINT OUT EACH ELEMENT IN ORDER
            j++;
            inorderRecL(root.right);
        }
        setArraysorted(arraysorted);
    }


    @Override
    public List<T> sort(List<T> a) {
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

    public void setArraysorted(List<T> listsorted) {
        this.listsorted = listsorted;
    }



}
