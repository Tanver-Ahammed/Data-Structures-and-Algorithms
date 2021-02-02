package bubblesort;

import java.util.Scanner;

public class MainBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bubble Sort.\n");

        while (true) {
            System.out.print("Enter the length of Array: ");
            int len = scanner.nextInt();
            int []array = new int[len];
            System.out.println("Enter the Array elements(For sorting): ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Sorted Order\n(1) Ascending Odder\n(2) Descending Order");
            String sortedOrder = scanner.next();
            if (sortedOrder.equals("1")) {
                BubbleSort.bubbleSortAscOrder(array);
                BubbleSort.printAll(array);
            }
            else if (sortedOrder.equals("2")) {
                BubbleSort.bubbleSortDscOrder(array);
                BubbleSort.printAll(array);
            }
            else
                System.out.println("Your Order choice is WRONG!!\n");
        }
    }
}
