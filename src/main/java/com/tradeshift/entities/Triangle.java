package com.tradeshift.entities;

/**
 * Created by js on 10/19/16.
 */
public class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 ||  c <=0)
            throw new IllegalArgumentException("All arguments should be greater then 0");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType(){
        if(allSidesAreEqual())
            return "Equilateral";
        if(twoSidesAreEqual())
            return "Isosceles";
        return "Scalene";
    }

    private boolean twoSidesAreEqual() {
        return a == b || a == c;
    }

    private boolean allSidesAreEqual() {
        return a == b && b == c;
    }
}
