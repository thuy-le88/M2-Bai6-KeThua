package point;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x=x;
        this.y=y;
    }
    public String getXY() {
        return "{"+this.x+", "+this.y+"}";
    }

    @Override
    public String toString() {
        return "Point2D "+this.getXY();
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(10,20);
        System.out.println(point2D);
    }
}
