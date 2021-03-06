package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTest1(){
        Vector<Integer> vec = new Vector<>();

        Integer expectedCapacity = 10;
        Integer actualCapacity = vec.capacity();
        Assert.assertEquals(expectedCapacity, actualCapacity);

        Assert.assertTrue(vec.isEmpty());

        Integer[] intArray = {12, 13, 14, 15, 16};
        vec.addAll(Arrays.asList(intArray));

        Integer expectedInt = 12;
        Assert.assertTrue(vec.contains(expectedInt));

        Integer actualInt = vec.get(0);
        Assert.assertEquals(expectedInt, actualInt);

        Integer expectedInt2 = 16;
        Integer actualInt2 = vec.remove(4);
        Assert.assertEquals(expectedInt2, actualInt2);

        vec.trimToSize();
        Integer expectedSize = 4;
        Integer actualSize = vec.size();
        Assert.assertEquals(expectedSize, actualSize);

        vec.add(500);
        Integer expectedSize2 = 5;
        Integer actualSize2 = vec.size();
        Assert.assertEquals(expectedSize2, actualSize2);

    }

}
