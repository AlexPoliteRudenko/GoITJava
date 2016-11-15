package Core.Module03.Practice;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 1, 2, 2, 5, 0);
        Triangle triangle2 = new Triangle(1, 32, 2, 6, 5, 0);
        Triangle triangle3 = new Triangle(1, 1, 2, 2, 5, 5);
        triangle1.print();
        triangle2.print();
        triangle3.print();
    }
}
