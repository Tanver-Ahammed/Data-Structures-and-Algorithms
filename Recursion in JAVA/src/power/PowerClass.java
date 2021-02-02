package power;

public class PowerClass {
    public static int findThePowerValue(int base, int power) {
        if (power == 0)
            return 1;
        else {
            return base * findThePowerValue(base, power - 1);
        }
    }
}
