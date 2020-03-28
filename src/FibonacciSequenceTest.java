import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FibonacciSequenceTest
{
    @Test
    public void testGetValue()
    {
        FibonacciSequence fib1 = new FibonacciSequence();
        int value1 = fib1.getValue();
        assertEquals(value1, 0);

        FibonacciSequence fib2 = new FibonacciSequence(4);
        int value2 = fib2.getValue();
        assertEquals(value2, 3);
    }

    @Test
    public void testGetNext()
    {
        FibonacciSequence fib = new FibonacciSequence(6);
        int value = fib.getNext();
        assertEquals(value, 13);
    }

    @Test
    public void testGetNthNumber()
    {
        int value = FibonacciSequence.getNthNumber(8);
        assertEquals(value, 21);
    }

    @Test
    public void testGetNthNumberRange()
    {
        int[] range = FibonacciSequence.getNthNumberRange(3, 4);
        int[] expected = new int[4];
        expected[0] = 2;
        expected[1] = 3;
        expected[2] = 5;
        expected[3] = 8;

        assertEquals(range, expected);
    }
}
