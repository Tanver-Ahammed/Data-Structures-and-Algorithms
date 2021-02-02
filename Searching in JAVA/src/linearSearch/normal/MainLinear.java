package linearSearch.normal;

import java.util.Scanner;

public class MainLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Search without Recursion.\n");

        while (true) {
            System.out.print("Enter The Length of Array: ");
            int len = scanner.nextInt();
            int []array = new int[len];
            System.out.println("Enter the Arrays Value: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter the search value: ");
            int sValue = scanner.nextInt();
            int result = LinearSearch.findValue(array,sValue);
            if (result==-1)
                System.out.println(sValue+" isn't found in the Array.");
            else
                System.out.println(sValue+" is founded in the Array and index is "+result);
            System.out.println();
        }
    }
}
