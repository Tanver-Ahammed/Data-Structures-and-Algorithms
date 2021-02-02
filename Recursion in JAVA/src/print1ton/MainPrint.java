package print1ton;

import java.util.Scanner;

public class MainPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here we print 1 to n and n to 1\nby using Recursion.\n");

        while (true) {
            System.out.print("Please Enter the number: ");
            int number = scanner.nextInt();
            System.out.println("Print 1 to N by using Recursion:");
            Print1toNNum.print1ToNNumber(1, number);
            System.out.println("Print N to 1 by using Recursion:");
            Print1toNNum.printNTo1Number(number);
            System.out.println();
        }
    }
}