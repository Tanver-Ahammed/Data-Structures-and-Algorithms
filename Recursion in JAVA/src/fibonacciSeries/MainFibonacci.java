package fibonacciSeries;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program find out of Fibonacci\n"+
                "number and series.\n");

        while (true) {
            System.out.print("Enter the n th number for Fibonacci: ");
            Integer number = scanner.nextInt();
            System.out.println(number+" th Fibonacci Number is "+Fibonacci.nthFindFibonacci(number));

            int f1=0,f2=1,f3;
            System.out.println("Fibonacci Series: ");

            for (int i = 0; i <= number; i++) {
                System.out.print(Fibonacci.nthFindFibonacci(i)+" ");
            }

            System.out.println("\nFibonacci Series another way: ");

            if (number==0){
                System.out.println(f1);
            }
            else if (number==1){
                System.out.println(f1+" "+f2);
            }
            else {
                System.out.print(f1+" "+f2+" ");
                Fibonacci.fibonacciSeries(number-1,0,0,1,0);
            }
            System.out.println("\n");
        }
    }
}
