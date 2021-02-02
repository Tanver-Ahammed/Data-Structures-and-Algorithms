package jenny;

public class LinearQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public LinearQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[this.size];
    }

    public void enqueue(int item) {
        if (rear == size - 1)
            System.out.println("Your Queue is Full!!\n");
        else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = item;
            System.out.println(item + " is enqueued successfully!!\n");
        } else {
            rear++;
            queue[rear] = item;
            System.out.println(item + " is enqueued successfully!!\n");
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Your Queue is Empty!!\n");
        } else if (front == rear) {
            System.out.println("Your enqueue item is: " + queue[front] + "\n");
            front = rear = -1;
        } else {
            int item = queue[front];
            front++;
            System.out.println("Your enqueue item is: " + item + "\n");
        }
    }

    public void peek() {
        if (front == -1 && rear == -1) {
            System.out.println("Your Queue is Empty!!\n");
        } else {
            System.out.println(queue[front] + "\n");
        }
    }

    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Your Queue is Empty!!\n");
        } else {
            System.out.println(front+" "+rear);
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println("\n");
        }
    }
}