package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int MAX_SIZE = 12;
    private final int EMPTY_RHYMER_INDICATOR = -1;
    private final int DEFAULT = -1;
    private final int FULL_RHYMER_INDICATOR = MAX_SIZE-1;
    private final int[] numbers = new int[MAX_SIZE];


    private int total = -1;
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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
