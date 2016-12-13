package core.module07.practice;

import java.util.Comparator;

public class UserSort implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if ((o1.getLastName().compareTo(o2.getLastName()) != 0)) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
