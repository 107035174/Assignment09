package Assignment09;

public class ArrayQueueImpl {
    private int[] arr;
    private int front;
    private int rear;

    ArrayQueueImpl() {
        arr = new int[4];
        front = 0;
        rear = 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
//implement
    }

    public void enqueue(int obj) {
//implement
        if (rear == arr.length) resize();
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = arr[front];
        front++;
        return temp;
//implement
    }

    public boolean isEmpty() {
//implement
        return front == rear;
    }

    public int size() {
//implement
        return rear - front;
    }

    private void resize() {
//implement
        System.out.println("Resizing");
        int len = arr.length;
        int newlen = len * 2;
        int[] temp = new int[newlen];
        System.arraycopy(arr, 0, temp, 0, len);
        arr = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i < rear - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[rear - 1]).append("]");
        return sb.toString();
    }
}
