package core.module08.practice;

public class Point {
    private final int x;
    private final int y;

    public Point(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
