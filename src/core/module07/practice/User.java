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
        String name = getLastName() + getFirstName();
        String nameO = o.getLastName() + o.getFirstName();
        if (name.compareTo(nameO) != 0) {
            return name.compareTo(nameO);
        } else if ((this.age - o.age) != 0) {
            return this.age - o.age;
        }
            return 0;
    }
}
