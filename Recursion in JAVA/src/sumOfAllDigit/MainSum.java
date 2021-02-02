package sumOfAllDigit;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        System.out.println("This program find out of sum\n" +
                "of all digit in number.\n");

        while (true) {
            System.out.print("Enter the number which sum of all Digit: ");
            int number = new Scanner(System.in).nextInt();
            System.out.println(number+" Number all Digit sum is "+SumAllDigitInANumber.sum(number)+"\n");
        }
    }
}
