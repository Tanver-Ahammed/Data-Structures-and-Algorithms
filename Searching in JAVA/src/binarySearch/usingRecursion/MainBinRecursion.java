package binarySearch.usingRecursion;

import java.util.Scanner;

public class MainBinRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Binary Search using Recursion\nYou can use Type of Integer.\n");

        while (true) {
            System.out.print("Enter The Length of Array: ");
            Integer len = scanner.nextInt();
            Integer []array = new Integer[len];
            System.out.println("Enter the Arrays Value(ASC Order): ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter the search value: ");
            Integer sValue = scanner.nextInt();
            Integer left,right;
            left=0;
            right=array.length-1;
            int result = BinarySearchUsingRecursion.binarySrcRecursion(array,sValue,left,right);
            if (result==-1)
                System.out.println(sValue+" isn't found in the Array.");
            else
                System.out.println(sValue+" is founded in the Array and index is "+result);
            System.out.println();
        }
    }
}
