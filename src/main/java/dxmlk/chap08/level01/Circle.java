package dxmlk.chap08.level01;

public class Circle extends Shape implements Resizable{
    private double radius;

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
