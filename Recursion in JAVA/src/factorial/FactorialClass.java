package factorial;

public class FactorialClass {
    public static long findThFactorialValue(int number) {
        if (number == 1 || number == 0)
            return 1;
        else {
            return number * findThFactorialValue(number - 1);
        }
    }
}
