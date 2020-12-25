public class Circle {
    private double radius;
    private static int count;
    private static final double PI = 3.14;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Circle.count = count;
    }

    public static double getPI() {
        return PI;
    }

    public double getCircleArea(){
        return getPI() * getRadius() * 2;
    }

    public static Circle generateCircle(){
        double[] radius = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return new Circle();
    }
}
