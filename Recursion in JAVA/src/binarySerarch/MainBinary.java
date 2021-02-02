package binarySerarch;

import java.util.Scanner;

public class MainBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program Binary Search using Recursion.\n");

        while (true) {
            System.out.print("Enter the length of Array: ");
            int lenOfArr = scanner.nextInt();
            System.out.println("Enter the Numbers of Array (ASC order): ");
            int [] array = new int[lenOfArr];
            for (int i = 0; i < lenOfArr; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter the Search Value: ");
            int sValue = scanner.nextInt();
            int left = 0;
            int right = array.length - 1;
            int index = BinarySearchClass.binarySearch(array, sValue, left, right);
            if (index>=0) {
                System.out.println("Your Search value is Find "+index+" No Index.");
                System.out.println("Your Search value is Find "+index+" No Index.");
            }
            else
                System.out.println("Your Search value does't Find.");
                System.out.println("So,Your index is "+index+".");
            System.out.println();
        }
    }
}