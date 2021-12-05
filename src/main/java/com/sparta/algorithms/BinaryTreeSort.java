package com.sparta.algorithms;

public class BinaryTreeSort {

    //  Nested Class with left and right child of current node and value in index
    public class Node {
        int key;
        Node left, right;

        public Node(int item) {
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

    public void insert(int key) {
        root = insertRec(root, key);
        setRoot(root);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    private int j = 0;
    private int[] arraysorted;

    public int[] getArraysorted() {
        return arraysorted;
    }

    public void setArraysorted(int[] arraysorted) {
        this.arraysorted = arraysorted;
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            arraysorted[j] = root.key;
            System.out.println(root.key + " ");
            j++;
            inorderRec(root.right);
        }
        setArraysorted(arraysorted);
    }

    public void treeins(int[] arr) {
        arraysorted = arr;
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
}
