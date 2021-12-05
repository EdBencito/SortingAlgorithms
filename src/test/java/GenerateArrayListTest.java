import com.sparta.data.GenerateArray;
import com.sparta.data.GenerateArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GenerateArrayListTest {

    private GenerateArrayList arl;

    @BeforeEach
    public void setup(){
        arl = new GenerateArrayList();
    }

    @Test
    public void arrayListListRandomint(){
        List<Integer> arrayListA = arl.generate(10);
        List<Integer> arrayListB = arl.generate(10);
        assertNotEquals(arrayListA,arrayListB);
    }

    @Test
    public void arrayListRandomchar(){
        List<Character> arrayListA = arl.generateC(13);
        List<Character> arrayListB = arl.generateC(13);
        assertNotEquals(arrayListA,arrayListB);
    }
    
}
