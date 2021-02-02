package print1ton;

public class Print1toNNum {
    public static void printNTo1Number(int num) {
        System.out.print(num + " ");
        if (num > 1) {
            printNTo1Number(num - 1);
        } else System.out.println();
    }

    public static void print1ToNNumber(int temp, int num) {
        System.out.print(temp + " ");
        if (temp < num)
            print1ToNNumber(temp + 1, num);
        else System.out.println();
    }
}
