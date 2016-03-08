/*
 * Triangle.java
 * 
 * Copyright 2016 Víctor Molina Ferreira <victor.molinaf@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package triangle;

/**
 * Modelizes a triangle.
 * 
 */
public class Triangle {

    /** The side 1 of the triangle. */
    private double side1;
    /** The side 2 of the triangle. */
    private double side2;
    /** The side 3 of the triangle. */
    private double side3;

    /**
     * Constructor by default. Creates a triangle with the sizes of the sides: 3,4 and 5.
     */
    
    public Triangle() {
        this.side1 = 3.0;
        this.side2 = 4.0;
        this.side3 = 5.0;
    }

    /**
     * Constructor with arguments.
     */
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Get the perimeter */
    public double perimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }
    /** Get the area */
    public double area() {
        // Calculate the semiperimeter
        double semiperimeter = perimeter() / 2.0;
        // Calculate the area
        return Math.sqrt(semiperimeter * (semiperimeter - this.side1) * (semiperimeter - this.side2) * (semiperimeter - this.side3));
    }
}