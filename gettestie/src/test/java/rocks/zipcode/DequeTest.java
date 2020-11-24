package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class DequeTest {

    @Test
    public void dequeTest1(){
        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();
        Person person1 = new Person("Peter", 1993);
        Person person2 = new Person("Andrew", 1993);
        Person person3 = new Person("Adam", 1992);

        arrayDeque.add(person2);
        arrayDeque.addFirst(person3);
        arrayDeque.addLast(person1);

        Assert.assertFalse(arrayDeque.isEmpty());

        Person expectedFirst = person3;
        Person expectedLast = person1;
        Person actualFirst = arrayDeque.peekFirst();
        Person actualLast = arrayDeque.peekLast();
        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedLast, actualLast);

        Person actualLastRemoved = arrayDeque.removeLast();
        Person actualFirstRemoved = arrayDeque.removeFirst();
        Assert.assertEquals(expectedFirst, actualFirstRemoved);
        Assert.assertEquals(expectedLast, actualLastRemoved);
    }
}
