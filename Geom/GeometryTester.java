package Geom.Geom;

public class GeometryTester {
    public static void main(String[] args) {

        Geom t1 = new Triangle();
        Geom r1 = new Rectangle();
        Geom c2 = new Circle();

        //Triangle t2 = new Triangle();
        //Rectangle r2 = new Rectangle();

        System.out.println(t1.compareTo(c2));
        System.out.println(c2.compareTo(r1));
    }
}
