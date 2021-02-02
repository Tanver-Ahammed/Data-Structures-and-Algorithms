package countDigitInANumber;

public class CountADigitInANumber {
    public static int countDigit(int number, int digit) {
        if (number <= 9) {
            if (number == digit)
                return 1;
            else
                return 0;
        } else {
            if (number % 10 == digit)
                return 1 + countDigit(number / 10, digit);
            else
                return 0 + countDigit(number / 10, digit);
        }
    }
}
