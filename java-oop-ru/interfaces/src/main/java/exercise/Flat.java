package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floorCount;

    public Flat(double area, double balconyArea, int floorCount) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        double totalArea = this.area + this.balconyArea;
        return totalArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() +  " метров на " + this.floorCount+ " этаже";
    }
}
// END
