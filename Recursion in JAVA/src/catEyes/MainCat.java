package catEyes;

import java.util.Scanner;

public class MainCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program we give number of cat\n" +
                "we can count the cats eye by using Recursion.\n");
        System.out.print("Enter the Number of Cats: ");
        int cats = scanner.nextInt();

        System.out.println(cats+" cat has " + CatEyesCount.catEyes(cats)+" eyes.");
    }
}
