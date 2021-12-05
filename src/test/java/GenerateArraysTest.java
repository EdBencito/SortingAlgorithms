
import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GenerateArraysTest {
    private GenerateArray ar;

    @BeforeEach
    public void setup(){
        ar = new GenerateArray();
    }

    @Test
    public void arrayRandomint(){
        Comparable[] arrayA = ar.generate(10);
        Comparable[] arrayB = ar.generate(10);
        assertNotEquals(arrayA,arrayB);
    }

    @Test
    public void arrayRandomchar(){
        Comparable[] arrayA = ar.generateC(13);
        Comparable[] arrayB = ar.generateC(13);
        assertNotEquals(arrayA,arrayB);
    }

}
