package ellipse;

import java.util.Random;

/**
 *
 * @author Ethan
 */
public class Ellipse {

    private static final int MIN = 5;
    private static final int MAX = 10;
    double majorAxis;
    double minorAxis;

    public Ellipse() {
        Random numGenerator = new Random();
        majorAxis = numGenerator.nextDouble(MAX - MIN) + MIN;
        minorAxis = numGenerator.nextDouble(MAX - MIN) + MIN;
    }

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    public Ellipse(Ellipse ellipse) {
        majorAxis = ellipse.majorAxis;
        minorAxis = ellipse.minorAxis;
    }

    public double calcArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    public double calcPerimeter() {
        double calculation = (majorAxis * majorAxis + minorAxis * minorAxis) / 2;
        return 2 * Math.PI * Math.sqrt(calculation);
    }

    public boolean isCircle() {
        return majorAxis == minorAxis;
    }

    public boolean isAxisValid() {
        return majorAxis > 0 && minorAxis > 0;
    }

    @Override
    public String toString() {
        return String.format("%-12s: %.2f\n", "Major-Axis", majorAxis) +
               String.format("%-12s: %.2f\n", "Minor-Axis", minorAxis) +
               String.format("%-12s: %.2f\n", "Area", calcArea()) +
               String.format("%-12s: %.2f\n", "Perimeter", calcPerimeter()) +
               String.format("This ellipse is %sa circle", isCircle() ? "" : "not ");
    }

    public boolean equals(Ellipse ellipse) {
        return majorAxis == ellipse.majorAxis && minorAxis == ellipse.majorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        double tmp = this.majorAxis;
        this.majorAxis = majorAxis;
        if (!isAxisValid()) {
            System.out.println("The new value must be a positive value.");
            this.majorAxis = tmp;
        }
    }

    public void setMinorAxis(double minorAxis) {
        double tmp = this.minorAxis;
        this.minorAxis = minorAxis;
        if (!isAxisValid()) {
            System.out.println("The new value must be a positive value.");
            this.minorAxis = tmp;
        }
    }

}
