package sumOfAllDigit;

public class SumAllDigitInANumber {
    public static int sum(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + sum(number / 10);
        }
    }
}