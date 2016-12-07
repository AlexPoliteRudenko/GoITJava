package core.module06.practice;

public class Main {
    public static void main(String[] args) {
        ObjectUnique unique = new ObjectUnique();
        ObjectRegular regular = new ObjectRegular();

        unique.hide();
        unique.show();
        unique.show();
        unique.hide();
        unique.hide();
        System.out.println();
        regular.show();
        regular.show();
        regular.show();
        regular.hide();
    }
}
