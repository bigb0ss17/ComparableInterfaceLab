package Geom.Geom;

public class Rectangle extends Geom implements Comparable<Geom>{

    private double width,height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }


}
