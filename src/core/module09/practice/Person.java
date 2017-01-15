package core.module09.practice;

public class Person {
    private final String name;
    private final String lastName;
    private final String email;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Person(String name, String lastName, String email) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
}
