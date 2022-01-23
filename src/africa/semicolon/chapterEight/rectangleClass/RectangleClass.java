package africa.semicolon.chapterEight.rectangleClass;

public class RectangleClass {

    private double length;
    private double width;
    private double area;
    private double perimeter;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public RectangleClass() {
        this(1.0, 1.0);
    }

    public void setLength(double length) {
        if (length > 0.0 && length <= 20.0) this.length += length;
        else throw new IllegalArgumentException("Length doesnt meet requirement");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) this.width += width;
        else throw new IllegalArgumentException(("Width doesnt meet requirement"));
    }

    public double getWidth() {
        return width;
    }

    public void calculateArea() {
         area = length * width;
    }

    public double getArea() {
        return area;
    }

    public void calculatePerimeter() {
        perimeter = length * 2 + width * 2;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
