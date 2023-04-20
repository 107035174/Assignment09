package Assignment09;

public class Main1 {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        LinkedListStack stack1 = new LinkedListStack();
        System.out.println(stack1.isEmpty());
    }
}
