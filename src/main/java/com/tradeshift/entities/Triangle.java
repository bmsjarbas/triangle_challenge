package com.tradeshift.entities;

/**
 * Created by js on 10/19/16.
 */
public class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 ||  c <=0)
            throw new IllegalArgumentException("All arguments should be greater then zero");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleType getType(){
        if(allSidesAreEqual())
            return TriangleType.EQUILATERAL;
        if(twoSidesAreEqual())
            return TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }

    private boolean twoSidesAreEqual() {
        return a == b || a == c || b == c;
    }

    private boolean allSidesAreEqual() {
        return a == b && b == c;
    }
}

