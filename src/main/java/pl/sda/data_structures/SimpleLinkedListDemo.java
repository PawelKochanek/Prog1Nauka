package pl.sda.data_structures;

public class SimpleLinkedListDemo {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList();

        System.out.println(simpleLinkedList.isEmpty() ? "Empty" : "Not empty");
        simpleLinkedList.prepend(12);
        simpleLinkedList.append(121);
        simpleLinkedList.append(1243);
        simpleLinkedList.append(1);
        simpleLinkedList.append(21);
        simpleLinkedList.append(541);

        for (int i = 0; i < simpleLinkedList.getSize(); i++) {
            System.out.println(simpleLinkedList.get(i));
        }

        simpleLinkedList.insert(1,1);
        System.out.println(simpleLinkedList.getSize());
        simpleLinkedList.remove(1);
        System.out.println(simpleLinkedList.getSize());

    }
}
