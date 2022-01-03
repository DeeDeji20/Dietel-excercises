package africa.semicolon.chapterSix.hypotenusCalculation;

public class HypotenusCalculation {
    public double hypotenuse(double side1, double side2) {
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }
}
