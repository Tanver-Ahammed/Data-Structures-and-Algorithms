package intStack;

public class Main {
    public static void main(String[] args) {
        IntStack intStack = new IntStack();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());

        intStack.display();

        intStack.pop();
        intStack.pop();

        intStack.display();

    }
}
