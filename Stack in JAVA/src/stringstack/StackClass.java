package stringstack;

public class StackClass {
    private String[] stringsStack;
    private int top;
    private int size;

    // Here define Empty constructor
    public StackClass() {
        top = -1;
        size = 50;
        stringsStack = new String[size];
    }

    // Here define size parameter constructor
    public StackClass(int size) {
        top = -1;
        this.size = size;
        stringsStack = new String[this.size];
    }

    // Here implements push() Method
    public void push(String item) {
        if (!isFull()) {
            top++;
            stringsStack[top] = item;
        }
        else
            System.out.println("Your Stack is Full!!\n");
    }

    // Here implement pop() Method
    public void pop() {
        if (!isEmpty()) {
            int temp = top;
            top--;
            System.out.println("Your pop item is:" + stringsStack[temp]+"\n");
        } else
            System.out.println("Your Stack is Empty!!\n");
    }

    // here implement peek()/top() Method
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Your Top item is: " + stringsStack[top]);
        }
        else
            System.out.println("Your Stack is Empty!!\n");
    }

    private boolean isFull() {
        return stringsStack.length == top+1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    // here print all the element
    public void printAll() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stringsStack[i]);
            }
            System.out.println();
        } else
            System.out.println("Your Stack is Empty!!\n");
    }
}
