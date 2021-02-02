package quicksort;

import margesort.MargeSort;

import java.util.Scanner;

public class MainQuick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quick sort\n");

        while (true) {
            System.out.print("Enter the length of Array: ");
            int len = scanner.nextInt();
            int[] array = new int[len];
            System.out.println("Enter the Array elements for Quick sort:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Sorted Order\n(1) Ascending Odder\n(2) Descending Order");
            String sortedOrder = scanner.next();
            if (sortedOrder.equals("1")) {
                QuickSort.quickSortMethod(array, 0, array.length - 1, true);
                MargeSort.printTheArray(array);
            }
            else if (sortedOrder.equals("2")) {
                QuickSort.quickSortMethod(array, 0, array.length - 1, false);
                MargeSort.printTheArray(array);
            }
            else
                System.out.println("Your Order choice is WRONG!!\n");

        }
    }
}
