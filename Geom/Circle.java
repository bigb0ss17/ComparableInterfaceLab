package Geom.Geom;

public class Circle extends Geom implements Comparable<Geom>{
    private double radius = 5.0;

    public double area(){
        return radius * radius * Math.PI;
    }

    public double perimeter(){return 2 * radius * Math.PI;}


}
