package dxmlk.chap08.level01;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2* (width+height);
    }
}
