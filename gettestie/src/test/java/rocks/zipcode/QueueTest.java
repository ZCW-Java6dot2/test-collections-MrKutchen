package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class QueueTest {

    @Test
    public void queueTest1(){

        LinkedList<Person> linkedList = new LinkedList<>();
        Person p1 = new Person("Peter", 1993);
        Person p2 = new Person("Andrew", 1993);
        Person p3 = new Person("Adam", 1992);

        Assert.assertTrue(linkedList.add(p1));
        Assert.assertTrue(linkedList.add(p2));
        Assert.assertTrue(linkedList.add(p3));

        Integer expectedSize = 3;
        Integer actualSize = linkedList.size();
        Assert.assertEquals(expectedSize, actualSize);

        Person expectedPerson1 = p1;
        Person actualPerson1 = linkedList.peek();
        Assert.assertEquals(expectedPerson1, actualPerson1);

        Person actualPerson2 = linkedList.remove();
        Assert.assertEquals(expectedPerson1, actualPerson2);
    }
}
