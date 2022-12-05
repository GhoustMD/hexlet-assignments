package exercise;

// BEGIN
public class Segment {
    private Point point;
    private Point point1;

    public Segment(Point point, Point point1) {
        this.point = point;
        this.point1 = point1;
    }

    public Point getBeginPoint() {
        return point;
    }

    public Point getEndPoint() {
        return point1;
    }

    public Point getMidPoint() {
        int x = (getBeginPoint().getX() + getEndPoint().getX()) / 2;
        int y = (getBeginPoint().getY() + getEndPoint().getY()) / 2;
        return new Point(x, y);
    }

}
// END
