import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenerateArrayList arl = new GenerateArrayList();
        GenerateArray ar = new GenerateArray();
        BubbleSort b = new BubbleSort();
        QuickSort q = new QuickSort();


//      ARRAYLIST TEST RANDOM GENERATE;
//        System.out.println(arl.staticarraylist(5));
//        List<Integer> a = arl.staticarraylist(5);
//        System.out.println(arl.generate(5));
//        int[] ars = ar.generate(5);
//        System.out.println(Arrays.toString(ars));
//        System.out.println("B sort:" + Arrays.toString(b.sort(ars)));
//        System.out.println("Q sort:" + Arrays.toString(q.sort(ars)) + "\n");



        List<Integer> arls = arl.generate(5);
        System.out.println(arls);

        System.out.println("B Sort" + b.sort(arls));
        System.out.println("Q Sort: " + q.sort(arls));

        List<String> arls1  = new ArrayList<String>();
        arls1.add("z");
        arls1.add("y");
        arls1.add("x");
        arls1.add("w");
        arls1.add("v");
        System.out.println(arls1);

        System.out.println("B Sort" + b.sort(arls1));
        System.out.println("Q Sort: " + q.sort(arls1));


    }
}
