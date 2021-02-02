package stackUsingClassTypeVariable;

public class Main {
    public static void main(String[] args) {
        IntStack intStack = new IntStack();

        Person person1 = new Person(19016,"Tanver");
        intStack.push(person1);

        intStack.push(new Person(19017,"Sheuly"));
        intStack.push(new Person(19018,"Tarique"));
        intStack.push(new Person(19019,"Bonna"));
        intStack.push(new Person(19020,"Utsha"));
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());

//        intStack.display();

        System.out.println(intStack.pop());
        intStack.pop();

        intStack.display();

    }
}
