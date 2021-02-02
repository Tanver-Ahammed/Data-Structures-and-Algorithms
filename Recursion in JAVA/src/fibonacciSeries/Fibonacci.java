package fibonacciSeries;

public class Fibonacci {

    public static long nthFindFibonacci(Integer number) {
        if (number==0) {
            return 0;
        }
        else if (number==1) {
            return 1;
        }
        else {
            return nthFindFibonacci(number-2)+nthFindFibonacci(number-1);
        }
    }

    public static void fibonacciSeries(int number,int count,int f1,int f2,int f3) {
        if (count==number)
            return;
        else {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
            fibonacciSeries(number,count+1,f1,f2,f3);
        }
    }
}