package stackUsingClassTypeVariable;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: "+this.id+" "+"Name: "+this.name;
    }
}
