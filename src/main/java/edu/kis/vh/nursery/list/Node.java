package edu.kis.vh.nursery.list;

/**
 * Klasa Node opisuje obiekt, który jest węzłem listy dwukierunkowej.
 * Obiekt posiada atrybuty value, prev oraz next. Value to wartość liczbowa w danym węźle.
 * Prev oraz next to obiekty reprezentujące odpowiednio węzeł przed i po obecnym węźle w
 * liście dwukierunkowej.
 */

public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     *
     * Konstruktor Node(int i) tworzy nowy obiekt ustawiając jego pole value na argument i
     *
     * @param i wartość ustawiana na pole value przy tworzeniu obiektu
     */
    public Node(int i) {
        value = i;
    }

    /**
     *
     * getValue() to getter zwracający wartość pola value
     *
     * @return wartość pola value
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * getNext() to getter zwracający wartośc pola next
     *
     * @return wartość pola next
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * setNext(Node next) to setter zmieniający wartość pola next obiektu na
     * wartość podaną w argumencie next
     *
     * @param next wartość ustawiana na pole next obiektu
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     *
     * getPrev() to getter zwracający wartość pola prev
     *
     * @return wartość pola prev
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *
     * setPrev(Node prev) to setter zmieniający warość pola prev obiektu
     * na wartość podaną w argumencie prev
     *
     * @param prev wartość ustawiana na pole prev obiektu
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
