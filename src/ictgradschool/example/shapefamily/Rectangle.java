package ictgradschool.example.shapefamily;

public class Rectangle implements Polygon {
    private double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
