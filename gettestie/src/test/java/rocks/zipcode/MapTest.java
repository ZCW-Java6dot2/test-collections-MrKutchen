package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MapTest {

    @Test
    public void mapTest1() {
        HashMap<Person, Integer> hashMap = new HashMap<Person, Integer>();

        //Should be empty
        Assert.assertTrue(hashMap.isEmpty());

        //put some things in it
        Person person1 = new Person("Peter", 1993);
        Person person2 = new Person("Andrew", 1993);
        Person person3 = new Person("Adam", 1992);
        Integer expectedVal = 1;
        Integer expectedVal2 = 67;
        hashMap.put(person1, expectedVal);
        hashMap.put(person2, expectedVal2);
        hashMap.put(person3, 247);

        Assert.assertTrue(hashMap.containsKey(person1));
        Assert.assertTrue(hashMap.containsValue(expectedVal2));

        Integer actualVal = hashMap.get(person1);
        Assert.assertEquals(hashMap.get(person1), expectedVal);

        hashMap.remove(person3);

        Integer expectedSize = 2;
        Integer actualSize = hashMap.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void mapTest2(){
        HashMap<Person, Integer> hashMap = new HashMap<>();
        Person person1 = new Person("Peter", 1993);

        Assert.assertFalse(hashMap.containsKey(person1));
        Assert.assertFalse(hashMap.containsValue(999));
        Assert.assertFalse(hashMap.remove(person1, 999));
    }
}
