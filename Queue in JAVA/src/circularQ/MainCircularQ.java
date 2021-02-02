package circularQ;

import java.util.Scanner;

public class MainCircularQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CircularQueue circularQueue = new CircularQueue(5);
        System.out.println("This is a String Stack Program.");
        while (true) {
            System.out.println("(1) enqueue()\n(2) dequeue()\n(3) peek()\n(4) print All");

            String choice = scanner.next();
            switch (choice) {

                case "1":
                    circularQueue.enqueue(scanner.nextInt());
                    break;
                case "2":
                    circularQueue.dequeue();
                    break;
                case "3":
                    circularQueue.peek();
                    break;
                case "4":
                    circularQueue.printAll();
                    break;
                default:
                    System.out.println("Your Choice is Wrong!!\n");
            }

        }
    }
}
