package core.module08.practice;

public class Circle extends Shape{

    private final int radius;

    public Circle(Point topPoint, int radius) {
        super(topPoint);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() + ';' +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

}
