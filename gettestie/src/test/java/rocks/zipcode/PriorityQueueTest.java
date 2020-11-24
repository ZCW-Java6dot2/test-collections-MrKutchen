package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void priorityQueueTest(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        Assert.assertTrue(priorityQueue.isEmpty());
        priorityQueue.add("Peter");
        priorityQueue.add("Andrew");
        priorityQueue.add("Adam");
        priorityQueue.add("Time");

        String expected = "Adam";
        String actual = priorityQueue.poll();
        Assert.assertEquals(expected,actual);

        String expected2 = "Andrew";
        String actual2 = priorityQueue.peek();
        Assert.assertEquals(expected2, actual2);

        Integer expectedSize = 3;
        Integer actualSize = priorityQueue.size();
        Assert.assertEquals(expectedSize, actualSize);

        priorityQueue.clear();
        Assert.assertTrue(priorityQueue.isEmpty());
    }
}
