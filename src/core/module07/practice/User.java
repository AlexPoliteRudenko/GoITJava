package core.module07.practice;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        /*String name = getFirstName();
        String surName = getLastName();
        String nameO = getFirstName();
        String surNameO = o.getLastName();
        if (name.compareTo(nameO) != 0) {
            return name.compareTo(nameO);
        } else if (surName.compareTo(surNameO) != 0) {
            return surName.compareTo(surNameO);
        } else {
            return this.age - o.age;
        }*/
            return this.age - o.age;
    }
}
