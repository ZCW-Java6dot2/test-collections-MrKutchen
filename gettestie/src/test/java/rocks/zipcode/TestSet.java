package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestSet {

    @Test
    public void hashSetTest(){
        HashSet<Person> hashSet = new HashSet<>();

        Assert.assertTrue(hashSet.isEmpty());

        Person p1 = new Person("Peter", 1993);
        Person p2 = new Person("Andrew", 1993);
        Person p3 = new Person("Adam", 1992);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        int expectedSize = 3;
        int actualSize = hashSet.size();

        Assert.assertEquals(expectedSize, actualSize);

        Assert.assertTrue(hashSet.contains(p1));

        Assert.assertFalse(hashSet.add(p1));

        Assert.assertTrue(hashSet.remove(p1));

        Assert.assertFalse(hashSet.contains(p1));

        Assert.assertFalse(hashSet.remove(p1));

        hashSet.clear();

        Assert.assertTrue(hashSet.isEmpty());
    }
}
