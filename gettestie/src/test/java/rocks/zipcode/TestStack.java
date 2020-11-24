package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Learning");
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        String expected = "Still learning";
        stack.push(expected);

        Assert.assertFalse(stack.isEmpty());

        Assert.assertEquals(expected, stack.peek());

        Assert.assertEquals(expected, stack.pop());

        Assert.assertTrue(stack.isEmpty());

    }
}
