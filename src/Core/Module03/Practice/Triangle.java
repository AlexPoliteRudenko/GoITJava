package Core.Module03.Practice;

public class Triangle {
    private boolean pointsAreOnOneLine;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double line1;
    private double line2;
    private double line3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        if ((x3 - x1)/(x2 - x1) == (y3 - y1)/(y2 - y1)){
//            System.out.println("All points are on one line");
            pointsAreOnOneLine = true;
        }
    }

    public void print() {

        if (!pointsAreOnOneLine) {
            System.out.println(perimetrTriangle());
            System.out.println(areaTriangle());
        } else {
            System.out.println("ALL POINTS IN ONE LINE");
        }
    }

    private double areaTriangle() {
//        double length1 =
        double halfOfPerimetr = perimetrTriangle() / 2;
        double area = Math.sqrt(halfOfPerimetr * (halfOfPerimetr - line1) * (halfOfPerimetr - line2) * (halfOfPerimetr - line3));
        return area;
    }

    private double perimetrTriangle() {
        double line1 = calculateLengthLine(x1, y1, x2, y2);
        double line2 = calculateLengthLine(x1, y1, x3, y3);
        double line3 = calculateLengthLine(x3, y3, x2, y2);

        return line1 + line2 + line3;
    }

    private double calculateLengthLine(int x1, int y1, int x2, int y2) {
        return (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }

}

