package core.module08.practice;

public class UseShapes {
    public static void main(String[] args) {
        Rectangle rectangle0 = new Rectangle(new Point(10, 12), 10, 20);
        Rectangle rectangle2 = new Rectangle(new Point(50, 44), 15, 30);
        Rectangle rectangle1 = new Rectangle(new Point(1, 100), 20, 40);
        Circle circle0 = new Circle(new Point(300, 500), 10);
        Circle circle1 = new Circle(new Point(100, 100), 10);
        Group group = new Group();

        group.add(rectangle0);
        group.add(rectangle1);
        group.add(rectangle2);
        group.add(circle0);
        group.add(circle1);

        group.getAll().forEach(System.out::println);
    }
}
