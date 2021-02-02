package linearQueue;

public class IntQueue {
    private int[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    public IntQueue() {
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    public IntQueue(int size) {
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];
    }

    public void enqueue(int item) {
        if (!isFull()) {
            total++;
            queue[rear] = item;
            rear++;
        } else
            System.out.println("Your Queue is Full!!\n");
    }

    public void dequeue() {
        if(!isEmpty()) {
            int item = queue[front];
            front++;
            total--;
            System.out.println("Your dequeue item is: "+item);
        }
        else
            System.out.println("Your Queue is Empty!!\n");
    }

    public void peek() {
        if (!isEmpty())
            System.out.println("Your peek Item is: "+queue[front]+"\n");
        else
            System.out.println("Your Queue is Empty!!\n");
    }

    public void printAll() {
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
            System.out.println("\n");
        }
        else
            System.out.println("Your Queue is Empty!!\n");
    }

    private boolean isFull() {
        return rear == size - 1;
    }

    private boolean isEmpty() {
        if (front == rear){
            front = rear = 0;
        }
        return (front == 0 && rear == 0);
    }
}
