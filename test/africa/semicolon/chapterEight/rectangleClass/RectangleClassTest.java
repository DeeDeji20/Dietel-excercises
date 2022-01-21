package africa.semicolon.chapterEight.rectangleClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    @Test
    public void testThatLengthCanBeSet(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.setLength(1.0);
        double lenght = rectangleClass.getLength();
        assertEquals(2.0, lenght);
    }

    @Test
    public void testThatWidthCanBeSet(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.setWidth(1.0);
        double width = rectangleClass.getWidth();
        assertEquals(2.0, width);
    }
    @Test
    public void testThatWidthIsFloatingPointNumbers(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.setWidth(1.1);
        assertEquals(2.1, rectangleClass.getWidth());
    }
    @Test
    public void testThatLengthIsFloatingPointNumbers(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.setLength(1.1);
        assertEquals(2.1, rectangleClass.getLength());
    }

    @Test
    public void testThatLengthIsGreaterThan0(){
        RectangleClass rectangleClass = new RectangleClass();
//        rectangleClass.setLength(-1.0);
//        assertEquals(1.0, rectangleClass.getLength());
        assertThrows(IllegalArgumentException.class, ()-> rectangleClass.setLength(-1.0));
    }

    @Test
    public void testThatLengthIsLessThan20() throws IllegalArgumentException{
        RectangleClass rectangleClass = new RectangleClass();
        assertThrows(IllegalArgumentException.class, ()-> rectangleClass.setLength(21.0));
    }

    @Test
    public void testThatWidthIsGreaterThan0() throws IllegalArgumentException{
        RectangleClass rectangleClass = new RectangleClass();
//        rectangleClass.setWidth(-1.0);
//        assertEquals(1.0, rectangleClass.getWidth());
        assertThrows(IllegalArgumentException.class, ()-> rectangleClass.setLength(-1.0));
    }
    @Test
    public void testThatWidthIsLessThan0() throws IllegalArgumentException{
        RectangleClass rectangleClass = new RectangleClass();
        assertThrows(IllegalArgumentException.class, ()-> rectangleClass.setLength(21.0));

    }

    @Test
    public void testAreaOFRectangleCanBeCalculated(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.calculateArea();
        double area = rectangleClass.getArea();
        assertEquals(1.0, area);
    }

    @Test
    public void testerimeterOFRectangleCanBeCalculated(){
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.calculatePerimeter();
        double perimeter = rectangleClass.getPerimeter();
        assertEquals(4.0, perimeter);
    }
}