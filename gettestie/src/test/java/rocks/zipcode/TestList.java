package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestList {

    @Test
    public void listTestPositive(){
        ArrayList<Person> raymond = new ArrayList<>();

        Assert.assertTrue(raymond.isEmpty());

        Person p1 = new Person("Peter", 1993);
        Person p2 = new Person("Andrew", 1993);
        Person p3 = new Person("Adam", 1992);
        Assert.assertTrue(raymond.add(p1));
        Assert.assertTrue(raymond.add(p2));
        Assert.assertTrue(raymond.add(p3));

        Assert.assertTrue(raymond.contains(p2));

        Assert.assertTrue(raymond.remove(p2));

        int expectedSize = 2;
        int actualSize = raymond.size();
        Assert.assertEquals(expectedSize, actualSize);

        Person expectedPerson = p3;
        Person actualPerson = raymond.get(1);
        Assert.assertEquals(expectedPerson, actualPerson);

        raymond.clear();
        Assert.assertTrue(raymond.isEmpty());

    }

    @Test
    public void testListNegative(){
        ArrayList<Person> ken = new ArrayList<>(0);
        Person p1 = new Person("Ken", 1958);

        Assert.assertFalse(ken.contains(p1));

        Assert.assertFalse(ken.remove(p1));

    }
}
