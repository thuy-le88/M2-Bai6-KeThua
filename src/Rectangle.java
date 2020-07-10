public class Rectangle extends Shape {
    double width;
    double lenght;
    public Rectangle() {
        width=1.0;
        lenght=1.0;
    }
    public Rectangle(double width, double lenght) {
        this.width=width;
        this.lenght=lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color,filled);
        this.lenght=lenght;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea() {
        return width*lenght;
    }
    public double getPerimeter() {
        return 2*(width+lenght);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLenght()
                + ", which is a subclass of "
                + super.toString();
    }
}
