package stackUsingClassTypeVariable;

public class IntStack {
    private Person[] stack;
    private int top;
    private int size;

    public IntStack() {
        top = -1;
        size = 50;
        stack = new Person[size];
    }

    public IntStack(int size) {
        top = -1;
        this.size = size;
        stack = new Person[this.size];
    }

    public boolean push(Person person) {
        if (!isFull()) {
            top++;
            stack[top] = person;
            return true;
        } else
            return false;
    }

    public String pop() {
        if (!isEmpty()) {
            return String.valueOf(stack[top--]);
        } else
            return "Your stack is Empty!!";
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}