package shape;

public class Triangle extends Shape {
    private double x=1.0;
    private double y=1.0;
    private double z=1.0;
    public Triangle() {
    }
    public Triangle(double x,double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Triangle(String color, boolean filled, double x, double y, double z) {
        super(color, filled);
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double getPerimeter() {
        return this.x+this.y+this.z;
    }

    @Override
    public String toString() {
        return "shape.Triangle {x= "+this.x+"; y= "+this.y+"; z= "+this.z +"; color= "+this.getColor()
                +";filled= "+ this.isFilled()+"; Perimeter= "+this.getPerimeter();
    }
}
