package shape;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println();
        triangle= new Triangle(10,15,20);
        System.out.println(triangle);
        System.out.println();
        triangle=new Triangle("brown",false,10,15,20);
        System.out.println(triangle);
    }
}
