public class FibonacciSequence {
    //Current number n, representing the current value of the sequence as the nth value
    private int currentIndex;

    public FibonacciSequence()
    {
        currentIndex = 0;
    }

    //Creates a new Fibonacci sequence with a current value as the nth number in the sequence
    public FibonacciSequence(int n)
    {
        this.currentIndex = n;
    }

    //Gets the next number in the fibonacci sequence according to current value
    public int getNext()
    {
        currentIndex++;
        return getValue();
    }

    //Gets the current value of the Fibonacci sequence
    public int getValue()
    {
        return getNthNumber(currentIndex);
    }

    //Gets the nth number in the Fibonacci sequence
    public static int getNthNumber(int n)
    {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    //Gets a range of values in the Fibonacci sequence starting at n
    public static int[] getNthNumberRange(int n, int length)
    {
        int[] range = new int[length];
        for (int i = 0; i < range.length; i++)
            range[i] = getNthNumber(n + i);
        return range;
    }
}
