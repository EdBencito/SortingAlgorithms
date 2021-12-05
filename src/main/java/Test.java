import com.sparta.algorithms.BinaryTreeSort;
import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test<E> {

    public static void main(String[] args) {
        GenerateArrayList arl = new GenerateArrayList();
        GenerateArray ar = new GenerateArray();
        BubbleSort b = new BubbleSort();
        QuickSort q = new QuickSort();
        BinaryTreeSort bts = new BinaryTreeSort();


////      GENERIC ARRAYS SORT
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        Comparable[] n = {5, 4, 3, 2, 1};
//
//
////        System.out.println("Unsorted;" + Arrays.toString(cars));
//        System.out.println("B Sort" + Arrays.toString(b.sort(n)));
//        System.out.println("Q Sort" +Arrays.toString(q.sort(n)));

//
//
//
////      ARRAYLIST TEST RANDOM GENERATE;
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

//        Comparable[] t1 = ar.staticarrayA();
//        Comparable[] t1 = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(t1));
//        bts.sort(t1);
//        bts.inorderRecA(bts.getRoot());
//        System.out.println(Arrays.toString(bts.getArraysorted()));

        List<String> t2  = new ArrayList<String>();
        t2.add("z");
        t2.add("y");
        t2.add("x");
        t2.add("w");
        t2.add("v");
        System.out.println(t2);
        bts.sort(t2);
        bts.inorderRecL(bts.getRoot());
        System.out.println(bts.getListsorted());


    }
}
