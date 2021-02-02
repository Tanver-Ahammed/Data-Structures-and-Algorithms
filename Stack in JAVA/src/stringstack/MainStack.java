package stringstack;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackClass stackClass = new StackClass(5);

        System.out.println("This is a String Stack Program.");
        while (true) {
            System.out.println("(1) push()\n(2) pop()\n(3) peek()\n(4) print All");

            String choice = scanner.next();
            switch (choice) {

                case "1":
                    stackClass.push(scanner.next());
                    break;
                case "2":
                    stackClass.pop();
                    break;
                case "3":
                    stackClass.peek();
                    break;
                case "4":
                    stackClass.printAll();
                    break;
                default:
                    System.out.println("Your Choice is Wrong!!");
            }

        }

    }
}
