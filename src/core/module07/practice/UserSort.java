package core.module07.practice;

import java.util.Comparator;

public class UserSort implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return (o1.getFirstName() + o1.getLastName()).compareTo(o2.getFirstName() + o2.getLastName());
    }
}
