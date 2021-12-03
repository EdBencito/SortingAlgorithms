import com.sparta.data.GenerateArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {
    private GenerateArray a;
    @BeforeEach
    public void setup(){ a = new GenerateArray();}

    @Test
    public void test1(){
        String expected = "0, 0, 0, 0, 0";
        String actual = a.generate(5).toString();
        assertEquals(expected,actual);


    }
}
