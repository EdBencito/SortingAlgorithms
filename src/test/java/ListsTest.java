import com.sparta.algorithms.BinaryTreeSort;
import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ListsTest {
    private BubbleSort b;
    private QuickSort q;
    private BinaryTreeSort bts;

    @BeforeEach
    public void setup() {
        b = new BubbleSort();
        q = new QuickSort();
        bts = new BinaryTreeSort();
    }

    @Test
    public void bSortArrayListint() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(10);
        unsorted.add(9);
        unsorted.add(8);
        unsorted.add(7);
        unsorted.add(6);
        unsorted.add(5);
        unsorted.add(4);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(1);
        List<Integer> actual = b.sort(unsorted);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void bSortArrayListchar() {
        List<Character> expected = new ArrayList<Character>();
        expected.add('q');
        expected.add('r');
        expected.add('s');
        expected.add('t');
        expected.add('u');
        expected.add('v');
        expected.add('w');
        expected.add('x');
        expected.add('y');
        expected.add('z');
        List<Character> unsorted = new ArrayList<Character>();
        unsorted.add('z');
        unsorted.add('y');
        unsorted.add('x');
        unsorted.add('w');
        unsorted.add('v');
        unsorted.add('u');
        unsorted.add('t');
        unsorted.add('s');
        unsorted.add('r');
        unsorted.add('q');
        List<Character> actual = b.sort(unsorted);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void qSortArrayListint() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(10);
        unsorted.add(9);
        unsorted.add(8);
        unsorted.add(7);
        unsorted.add(6);
        unsorted.add(5);
        unsorted.add(4);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(1);
        List<Integer> actual = q.sort(unsorted);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void qSortArrayListchar() {
        List<Character> expected = new ArrayList<Character>();
        expected.add('q');
        expected.add('r');
        expected.add('s');
        expected.add('t');
        expected.add('u');
        expected.add('v');
        expected.add('w');
        expected.add('x');
        expected.add('y');
        expected.add('z');
        List<Character> unsorted = new ArrayList<Character>();
        unsorted.add('z');
        unsorted.add('y');
        unsorted.add('x');
        unsorted.add('w');
        unsorted.add('v');
        unsorted.add('u');
        unsorted.add('t');
        unsorted.add('s');
        unsorted.add('r');
        unsorted.add('q');
        List<Character> actual = q.sort(unsorted);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void btsSortArrayListint() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(10);
        unsorted.add(9);
        unsorted.add(8);
        unsorted.add(7);
        unsorted.add(6);
        unsorted.add(5);
        unsorted.add(4);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(1);
        System.out.println("Expected: "+ (expected));
        System.out.print("Actual:");
        bts.sort(unsorted);
        bts.inorderRecA(bts.getRoot());

    }

    @Test
    public void btsSortArrayListchar() {
        List<Character> expected = new ArrayList<Character>();
        expected.add('q');
        expected.add('r');
        expected.add('s');
        expected.add('t');
        expected.add('u');
        expected.add('v');
        expected.add('w');
        expected.add('x');
        expected.add('y');
        expected.add('z');
        List<Character> unsorted = new ArrayList<Character>();
        unsorted.add('z');
        unsorted.add('y');
        unsorted.add('x');
        unsorted.add('w');
        unsorted.add('v');
        unsorted.add('u');
        unsorted.add('t');
        unsorted.add('s');
        unsorted.add('r');
        unsorted.add('q');
        System.out.println("Expected: "+ expected);
        System.out.print("Actual:");
        bts.sort(unsorted);
        bts.inorderRecL(bts.getRoot());

    }
}
