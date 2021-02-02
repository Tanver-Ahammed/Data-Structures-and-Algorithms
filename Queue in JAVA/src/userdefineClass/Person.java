package userdefineClass;

public class Person {
    private String nationalId;
    private String name;

    public Person(String id, String name) {
        this.nationalId = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NID: " + this.nationalId+"  Name: " + this.name;
    }
}
