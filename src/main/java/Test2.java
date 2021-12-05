import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        GenerateArray a = new GenerateArray();
        GenerateArrayList b = new GenerateArrayList();
        Comparable[] a1 = a.generate(20);
        Comparable[] a2 = a.generateC(20);

        System.out.println("array int" + Arrays.toString(a1));
        System.out.println("array char" + Arrays.toString(a2));

        System.out.println("list int" + b.generate(20));
        System.out.println("list char" +b.generateC(20));
    }
}
