package linearSearch.usingGenerics;

import java.util.Scanner;

public class MainGeneric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Search using Generics \nYou can use any Type of Objects.\n");

        while (true) {
            System.out.print("Enter The Length of Array: ");
            int len = scanner.nextInt();
            Object []array = new Object[len];
            System.out.println("Enter the Arrays Value: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.next();
            }
            System.out.print("Enter the search value: ");
            Object sValue = scanner.next();
            int result = LinearSearchUsingGenerics.linearSerGenerics(array,sValue);
            if (result==-1)
                System.out.println(sValue+" isn't found in the Array.");
            else
                System.out.println(sValue+" is founded in the Array and index is "+result);
            System.out.println();
        }
    }
}
