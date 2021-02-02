package power;

import java.util.Scanner;

public class MainPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program we give number of base and power\n" +
                "we can get base^power value by using Recursion.\nsuch as: 2^3=8\n");
        while (true) {
            int base, power;
            System.out.print("Enter Base: ");
            base = scanner.nextInt();

            System.out.print("Enter Base: ");
            power = scanner.nextInt();
            System.out.println(base + "^" + power + " is " + PowerClass.findThePowerValue(base, power));
            System.out.println();
        }
    }
}
