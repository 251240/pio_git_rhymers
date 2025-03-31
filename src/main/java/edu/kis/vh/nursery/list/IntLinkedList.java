package edu.kis.vh.nursery.list;


// TODO: class has no usages
public class IntLinkedList {

    private Node last;
    private int i;
    private final int EMPTY_RHYMER_INDICATOR = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: method isFull() only returns false
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
