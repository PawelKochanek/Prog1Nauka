package pl.sda.data_structures;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue();

        // empty test
        System.out.println(simpleQueue.isEmpty() ? "Empty" : "Not empty");
        System.out.println("Peek: " + simpleQueue.peek());
        simpleQueue.enqueue(39);
        System.out.println(simpleQueue.isEmpty() ? "Empty" : "Not empty");
        System.out.println("Peek: " + simpleQueue.peek());
        simpleQueue.enqueue(234);
        simpleQueue.enqueue(95);
        simpleQueue.enqueue(47);
        simpleQueue.enqueue(20);
        System.out.println(simpleQueue.isEmpty() ? "Empty" : "Not empty");
        System.out.println("Peek: " + simpleQueue.peek());

        System.out.println("\n");

        //dequeue
        while(!simpleQueue.isEmpty()){
            int deletedValue = simpleQueue.dequeue();
            System.out.println(deletedValue);
        }
        System.out.println();
        System.out.println(simpleQueue.isEmpty() ? "Empty" : "Not empty");
    }
}
