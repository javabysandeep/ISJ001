package collectionFramework;

public class Stack {
    int[] array;
    int stackCapacity = 5;
    int size = 0;
    int top = -1;

    public Stack() {
        array = new int[stackCapacity];
    }

    public Stack(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        array = new int[stackCapacity];
    }

    void push(int element) {
        if (stackCapacity == size) {
            System.out.println("Stack is full");
            return;
        }
        array[++top] = element;
        size++;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        size--;
        return array[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
//        stack.push(600);
        System.out.println("Size of stack "+stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
