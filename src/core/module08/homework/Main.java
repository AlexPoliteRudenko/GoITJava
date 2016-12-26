package core.module08.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user0 = new User(25667356L, "Name");
        User user1 = new User(25667312L, "Name");
        List<AbstractEntity> list = new ArrayList<>();
        list.add(user0);
        UserDAO<AbstractEntity> userDAO = new UserDAO<>();
        userDAO.saveAll(list);
        printList(userDAO.getList());
        userDAO.deleteAll(list);
        printList(userDAO.getList());
        userDAO.save(user0);
        userDAO.save(user1);
        printList(userDAO.getList());
        userDAO.delete(user0);
        printList(userDAO.getList());
        userDAO.save(user0);
        printList(userDAO.getList());
        System.out.println(userDAO.get(25667312L));
        userDAO.deleteById(25667312L);
        System.out.println("Operating... User with id 25667312L is deleted!");
        printList(userDAO.getList());


    }

    public static<T> void printList(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            System.out.print('[');
            for (T entity : list) {
                System.out.print(" " + entity + " ");
            }
            System.out.println(']');
        }
    }
}
