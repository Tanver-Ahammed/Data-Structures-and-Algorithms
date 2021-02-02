package countMobileSpeaker;

import java.util.Scanner;

public class MainMobile {
    public static void main(String[] args) {
        System.out.println("This program find out of mobile speakers\n" +
                "when given number of mobiles.\n"
                + "if numbers of mobile is even\n" +
                "it has 2 speaker else odd 1 speaker.\n");

        while (true) {
            System.out.print("Enter the number of mobiles: ");
            int mobiles = new Scanner(System.in).nextInt();
            System.out.println(mobiles+" has "+MobileSpeaker.findMobileSpeakers(mobiles)+" speakers.\n");
        }
    }
}
