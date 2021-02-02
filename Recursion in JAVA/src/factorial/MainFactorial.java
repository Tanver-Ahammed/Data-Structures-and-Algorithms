package factorial;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program find out Factorial Number\n" +
                "n!=1*2*3*.....*n.\n");
        while (true) {
            System.out.print("Enter the number for Factorial: ");
            int number = scanner.nextInt();
            System.out.println(number+"! = "+FactorialClass.findThFactorialValue(number)+"\n");
        }
    }
}