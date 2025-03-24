package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT = -1;
    public static final int FULL_RHYMER_INDICATOR = 11;
    private int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];
    

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
