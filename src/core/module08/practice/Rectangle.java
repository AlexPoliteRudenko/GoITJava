package core.module08.practice;

public class Rectangle extends Shape{
    private final int width;
    private final int height;

    public Rectangle(Point topPoint, int width, int height) {
        super(topPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
