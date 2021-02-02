package jenny;

import java.util.Scanner;

public class MainJenLQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinearQueue intQueue = new LinearQueue(5);
        System.out.println("This is a String Stack Program.");
        while (true) {
            System.out.println("(1) enqueue()\n(2) dequeue()\n(3) peek()\n(4) print All");

            String choice = scanner.next();
            switch (choice) {

                case "1":
                    intQueue.enqueue(scanner.nextInt());
                    break;
                case "2":
                    intQueue.dequeue();
                    break;
                case "3":
                    intQueue.peek();
                    break;
                case "4":
                    intQueue.display();
                    break;
                default:
                    System.out.println("Your Choice is Wrong!!\n");
            }

        }

    }
}
