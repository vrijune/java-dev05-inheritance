package ictgradschool.example.shapefamily;

public class ShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        shapeCalculator.start();
    }

    private void start() {
        Circle c1 = new Circle(2.0);
        Shape c2 = new Circle(3.0);
        printArea(c1);
        printArea(c2);

        Rectangle r = new Rectangle(4.5, 6.0);
        printArea(r);
    }

    private void printArea(Shape shape){
        System.out.println("Area is " + shape.getArea());
    }

}
