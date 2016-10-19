package com.tradeshift.entities;

/**
 * Created by js on 10/19/16.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType(){
        if(a == b && b == c)
            return "Equilateral";
        return "";
    }
}
