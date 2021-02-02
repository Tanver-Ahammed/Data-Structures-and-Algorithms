package countDigitInANumber;

import java.util.Scanner;

public class MainDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program find out of definite Digit\n" +
                "Total counting in a NUMBER.\n");

        while (true) {
            System.out.print("Enter the number: ");
            int number = new Scanner(System.in).nextInt();
            System.out.print("Enter the Digit: ");
            int digit = new Scanner(System.in).nextInt();
            System.out.println(digit+" has "+number+" Number: "+ CountADigitInANumber.countDigit(number,digit)+"\n");
        }
    }
}
