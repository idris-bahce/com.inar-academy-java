package chapters.chapter10.exercises.Exercise10_12;

import chapters.chapter10.exercises.Exercise10_04.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * Math.abs(s - s3));
    }
    public double getPerimeter(){
        double s1 = p1.distance(p2);
        double s2 = p1.distance(p3);
        double s3 = p2.distance(p3);
        return s1 + s2 + s3;
    }
    public boolean contains(double x, double y) {
        MyPoint p = new MyPoint(x, y);

        boolean b1, b2, b3;

        b1 = loc(p, p1, p2) < 0.0;
        b2 = loc(p, p2, p3) < 0.0;
        b3 = loc(p, p3, p1) < 0.0;

        return ((b1 == b2) && (b2 == b3));

    }

    private double loc(MyPoint p, MyPoint p1, MyPoint p2) {

        double x = p.getX();
        double y = p.getY();
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        return (x - x2) * (y1 - y2) - (x1 - x2) * (y - y2);
    }
    public boolean contains(Triangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (this.contains(points[i].getX(), points[i].getY())) {
                count++;
            }
        }

        return count == 3;
    }

    public boolean overlaps(Triangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for(int i = 0; i < 3; i++) {
            if(this.contains(points[i].getX(), points[i].getY()))
                count++;
        }

        return (count > 0 && count < 3);
    }
}
