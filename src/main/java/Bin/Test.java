package Bin;

import com.sparta.algorithms.BinaryTreeSort;
import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;
import java.util.ArrayList;
import java.util.List;

public class Test<E> {

    public static void main(String[] args) {
        GenerateArrayList arl = new GenerateArrayList();
        GenerateArray ar = new GenerateArray();
        BubbleSort b = new BubbleSort();
        QuickSort q = new QuickSort();
        BinaryTreeSort bts = new BinaryTreeSort();


//        Comparable[] n = {5, 4, 3, 2, 1, 9, 8, 7, 6, 5};
////        Comparable[] n = ar.generateC(10000);
//
////        System.out.println(Arrays.toString(q.sort(ar.generate(10))));
//        System.out.println(Arrays.toString(b.sort(n)));


//      GENERIC ARRAYS SORT
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        Comparable[] n = {5, 4, 3, 2, 1};
//
//
//        System.out.println("Unsorted;" + Arrays.toString(cars));
//        System.out.println("B Sort" + Arrays.toString(b.sort(cars)));
////        System.out.println("Q Sort" +Arrays.toString(q.sort(cars)));
//
//        System.out.println("Unsorted;" + Arrays.toString(n));
//        System.out.println("B Sort" + Arrays.toString(b.sort(n)));
////        System.out.println("Q Sort" +Arrays.toString(q.sort(n)));
//
//
////
////
//////      ARRAYLIST TEST RANDOM GENERATE;
//        System.out.println(arl.staticarraylist(5));
//        List<Integer> a = arl.staticarraylist(5);
//        System.out.println(arl.generate(5));
//        Comparable[] ars = ar.generate(5);
//        System.out.println(Arrays.toString(ars));
//        System.out.println("B sort:" + Arrays.toString(b.sort(ars)));
//        System.out.println("Q sort:" + Arrays.toString(q.sort(ars)) + "\n");
//
//
////
//        List<Integer> arls = arl.generate(5);
//        System.out.println(arls);
//
//        System.out.println("B Sort" + b.sort(arls));
//        System.out.println("Q Sort: " + q.sort(arls));
//
//        List<String> arls1  = new ArrayList<String>();
//        arls1.add("z");
//        arls1.add("y");
//        arls1.add("x");
//        arls1.add("w");
//        arls1.add("v");
//        System.out.println(arls1);
//
//        System.out.println("B Sort" + b.sort(arls1));
//        System.out.println("Q Sort: " + q.sort(arls1));

//        Comparable[] t2 = ar.generate(10000);
//        Comparable[] t1 = {5, 4, 3, 2, 1};
//        Comparable[] t3 = {"e", "d", "c", "b", "a"};
//        System.out.println(Arrays.toString(t2));
//
//        bts.sort(t2);
//        bts.inorderRecA(bts.getRoot());
//        System.out.println(Arrays.toString(bts.getArraysorted()));

        List<String> t2  = new ArrayList<String>();
        List<Character> t3  = arl.generateC(13);

        t2.add("z");
        t2.add("y");
        t2.add("x");
        t2.add("w");
        t2.add("v");
        System.out.println(t3);
        bts.sort(t3);
        System.out.print("Binary Tree  Sort Complete: ");
        bts.inorderRecL(bts.getRoot());
//        System.out.println(bts.getListsorted());

        // cannot run BTS list and array back to back


    }
}
