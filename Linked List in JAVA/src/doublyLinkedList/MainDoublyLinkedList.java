package doublyLinkedList;

import java.util.Scanner;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList linkedList = new DoublyLinkedList(50);

        while (true) {
            System.out.println("\n(1) Insert First\n" +
                    "(2) Insert Last\n" +
                    "(3) Delete\n" +
                    "(4) Print All\n");
            System.out.print("Choice: ");
            String choice = scanner.next();
            switch (choice) {

                case "1": {
                    System.out.print("Enter First insert Number(int): ");
                    Integer number = scanner.nextInt();
                    linkedList.insertFirst(number);
                    break;
                }

                case "2": {
                    System.out.print("Enter Last insert Number(int): ");
                    Integer number = scanner.nextInt();
                    linkedList.insertLast(number);
                    break;
                }

                case "3": {
                    System.out.print("Enter Delete Number(int): ");
                    Integer number = scanner.nextInt();
                    linkedList.delete(number);
                    break;
                }

                case "4": {
                    System.out.println("All The Elements:\n");
                    linkedList.printAll();
                    break;
                }

                default:
                    System.out.println("Your choice is wrong!!");
            }
        }
    }
}