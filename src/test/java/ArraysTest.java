import com.sparta.algorithms.BinaryTreeSort;
import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {
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
    public void bSortArrayint() {
        Comparable[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Comparable[] unsorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Comparable[] actual = b.sort(unsorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bSortArraychar() {
        Comparable[] expected = {"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Comparable[] unsorted = {"z", "x", "y", "w", "v", "u", "t", "s", "r", "q"};
        Comparable[] actual = b.sort(unsorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void qSortArrayint() {
        Comparable[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Comparable[] unsorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Comparable[] actual = q.sort(unsorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void qSortArraychar() {
        Comparable[] expected = {"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Comparable[] unsorted = {"z", "x", "y", "w", "v", "u", "t", "s", "r", "q"};
        Comparable[] actual = q.sort(unsorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void btsSortArrayint() {
        Comparable[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        Comparable[] unsorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Expected: "+ Arrays.toString(expected));
        System.out.print("Actual:");
        bts.sort(unsorted);
        bts.inorderRecA(bts.getRoot());

    }

    @Test
    public void btsSortArraychar() {
        Comparable[] expected = {"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Comparable[] unsorted = {"z", "x", "y", "w", "v", "u", "t", "s", "r", "q"};
        System.out.println("Expected: "+ Arrays.toString(expected));
        System.out.print("Actual:");
        Comparable[] actual = bts.sort(unsorted);
        bts.inorderRecA(bts.getRoot());

    }

}
