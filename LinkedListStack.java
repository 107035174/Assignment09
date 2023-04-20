
package Assignment09;

class LinkedListStack {
    private Node top;
    private int size;

    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public LinkedListStack() // constructor
    {
        top = new Node(null);
        size = 0;
    }

    public void push(Object item) // add an item on top of stack
    {
        Node n = new Node(item);
        n.next = top.next;
        top.next = n;
        size++;
    }

    public Object pop() // remove an item from top of stack
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public Object peek() // get top item of stack
    {
        if (isEmpty())
            return null;
        return top.next.data;
    }

    public boolean isEmpty() // true if stack is empty
    {
        return (size == 0);
    }

    public int size() // returns number of items in the stack
    {
        return size;
    }
}


