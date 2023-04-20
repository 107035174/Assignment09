package Assignment09;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q);
        q.dequeue();
        q.dequeue();
        System.out.println(q);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        System.out.println(q);
        q.dequeue();
        q.dequeue();
        System.out.println(q);
        System.out.println(q.size());
    }
}
