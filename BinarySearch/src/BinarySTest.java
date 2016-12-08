import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BinarySTest {

    @Test
    public void Test1(){
        short[] a = {2, 7, 18, 42, 78};
        int index = 3;
        short key = a[index];

        assertEquals(index, BinaryS.binarySearch(a, key));
    }

    @Test
    public void test2(){
        short[] a = new short[2147483645];
        for(int i = 0; i < a.length; i++){
            a[i] = (short) i;
        }

        Arrays.sort(a);

        int index = 2147483640;
        short key = a[index];

        assertEquals(index, BinaryS.binarySearch(a, key));
    }


}
