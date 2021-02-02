public class Test {
    public static void main(String[] args) {
        printNumbers(5);
    }

    private static void printNumbers(int num) {
        if (num==0)
            return;
        else {
            System.out.println(num);
            printNumbers(num-1);
        }
    }
}
