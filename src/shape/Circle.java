package shape;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        radius=1.0;
    }
    public Circle(double radius) {
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double gerArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "shape.Circle{" +
                "radius=" + radius +
                super.toString()+
                '}';
    }
}
