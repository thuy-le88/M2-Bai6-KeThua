package shape;

public class Square extends Rectangle {
    public Square() {
        width=1.0;
        lenght=1.0;
    }
    public Square (double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color,filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLenght(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        setLenght(lenght);
    }

    @Override
    public String toString() {
        return "A shape.Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
