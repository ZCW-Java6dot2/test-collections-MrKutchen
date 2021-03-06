package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void testTreeMap1(){
        TreeMap<Integer, Character> tree = new TreeMap<>();

        tree.put(5, 'E');
        tree.put(1, 'A');
        tree.put(3, 'C');
        tree.put(26, 'Z');
        tree.put(2, 'B');
        tree.put(4, 'D');

        Integer expected = 1;
        Integer actual = tree.firstKey();

        Integer expected2 = 26;
        Integer actual2 = tree.lastKey();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);

        Integer expected3 = 5;
        Integer actual3 = tree.higherKey(4);

        Assert.assertEquals(expected3, actual3);

        Integer expected4 = 3;
        Integer actual4 = tree.floorKey(4);


    }

    @Test
    public void testTreeMap2(){
        TreeMap<Integer, Character> tree = new TreeMap<>();

        tree.put(26, 'Z');

        Assert.assertNull(tree.lowerKey(26));
        Assert.assertNull(tree.higherKey(26));
        Assert.assertNotNull(tree.floorKey(26));
        Assert.assertNotNull(tree.ceilingKey(26));
        Assert.assertNull(tree.remove(1));
        Assert.assertFalse(tree.isEmpty());


    }

}
