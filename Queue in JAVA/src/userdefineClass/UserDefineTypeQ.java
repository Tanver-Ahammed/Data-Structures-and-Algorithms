package userdefineClass;

public class UserDefineTypeQ {
    private Person[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    public UserDefineTypeQ() {
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new Person[size];
    }

    public UserDefineTypeQ(int size) {
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new Person[this.size];
    }

    public void enqueue(Person item) {
        if (!isFull()) {
            total++;
            queue[rear] = item;
            rear = (rear + 1) % size;
            System.out.println("(" + item + ") is enqueued!!\n");
        } else
            System.out.println("Your Queue is Full!!\n");
    }

    public void dequeue() {
        if (!isEmpty()) {
            Person item = queue[front];
            front = (front + 1) % size;
            total--;
            System.out.println("Your dequeue item is: (" + item.toString() + ")\n");
        } else
            System.out.println("Your Queue is Empty!!\n");
    }

    public void peek() {
        if (!isEmpty())
            System.out.println("Your peek Item is: (" + queue[front] + ")\n");
        else
            System.out.println("Your Queue is Empty!!\n");
    }

    public void printAll() {
        if (!isEmpty()) {
            int f = front;
            int temp = 0;

            while (temp < total) {
                System.out.println(queue[f] + " ");
                ++f;
                f = f % size;
                temp++;
            }
            System.out.println("\n");

        } else
            System.out.println("Your Queue is Empty!!\n");
    }

    private boolean isFull() {
        return total == size;
    }

    private boolean isEmpty() {
        return total == 0;
    }

}
