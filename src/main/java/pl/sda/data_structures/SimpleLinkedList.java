package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 *  - prepend - dodaje element na poczatek listy
 *  - append - dodaje element na koniec listy
 *  - insert - dodaje element na zadanym indeksie
 *  - remove - usuwa element na podanym indeksie z listy
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest pusta
 *  - get - zwraca wartosc elementow na zadanym indeksie
 */
public class SimpleLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    public void prepend(T element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
        size++;
    }

    public void append(T element) {
        Node newNode = new Node(element);

        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insert(T element, int index) {
        if(isEmpty())
            return;

        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if(index == 0) {
            prepend(element);
        } else if(index == size) {
            append(element);
        } else {
            Node pre = head;
            for(int i = 0; i < index - 1; i++) {
                pre = pre.nextNode;
            }

            Node newNode = new Node(element);

            Node aft = pre.nextNode;
            pre.nextNode = newNode;
            newNode.nextNode = aft;
            size++;
        }
    }

    public void remove(int index) {
        if(isEmpty()) {
            return;
        }

        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node pre = head;
        for(int i = 0; i < index - 1; i++) {
            pre = pre.nextNode;
        }

        Node del = pre.nextNode;
        Node aft = del.nextNode;

        pre.nextNode = aft;
        del = null;
        size--;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node iterator = head;
        for(int i = 0; i < index; i++) {
            iterator = iterator.nextNode;
        }
        return (T) iterator.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private class Node<T> {
        T value;
        Node nextNode;

        Node(T value) {
            this.value = value;
        }
    }
}

