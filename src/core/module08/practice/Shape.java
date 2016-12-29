package core.module08.practice;

public abstract class Shape {
    private Point topPoint;

    public Shape(Point topPoint) {
        this.topPoint = topPoint;
    }

    @Override
    public String toString() {
        return "start:" + topPoint;
    }
}
