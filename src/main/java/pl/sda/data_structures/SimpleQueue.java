package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj kolejke, przechowujaca dane typu int
 * Kolejka powininna posiadac nastepujace metody:
 *  - enqueue - dodaje element do kolejki
 *  - dequeue - usuwa element z kolejki
 *  - peek - pozwala podejrzec element na poczatku kolejki
 *  - isEmpty - sprawdza czy kolejka jest pusta
 */
public class SimpleQueue {
    private static final int NOT_FOUND = -1;

    private Node head;
    private Node tail;
    private int size;

    public int peek(){////////////                  TRUE : FALSE
        if(head == null){////// return head == null ? -1 : head.value ////// skrót całości zapisu
            return NOT_FOUND;
        }
        return head.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(int element){
        Node newNode = new Node(element);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            return NOT_FOUND;
        }
        Node tmp = head;
        head = head.nextNode;
        int returnValue = tmp.value;
        tmp = null;
        size--;
        return returnValue;
    }



/////
    private class Node {
        int value;
        Node nextNode;
        Node(int value){
            this.value = value;
        }
    }
}
