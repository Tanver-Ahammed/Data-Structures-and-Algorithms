package basic;

import java.util.Scanner;

public class MainIntLinkList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntLinkedList linkedList = new IntLinkedList(5);
        System.out.println("This is a Linked List Code in JAVA.\n");

        while (true) {
            System.out.println("\n(1) Insert First\n" +
                    "(2) Insert Last\n" +
                    "(3) Delete\n" +
                    "(4) sort()\n"+
                    "(5) Print All\n");
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
                    linkedList.deleteItem(number);
                    break;
                }

                case "4": {
                    linkedList.sort();
                    System.out.println("Your Linked List is Sorted By Ascending Order!!");
                    break;
                }

                case "5": {
                    System.out.println("All The Elements:\n");
                    linkedList.printAllList();
                    break;
                }

                default:
                    System.out.println("Your choice is wrong!!");
            }
        }

    }
}
