package com.tradeshift.entities;

import org.junit.Test;

/**
 * Created by js on 10/19/16.
 */
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void givenSameValuesToABCWhenGetTriangleTypeThenShouldReturnEquilateral(){
        double a = 10;
        double b = 10;
        double c = 10;
        Triangle triangle = new Triangle(a,b,c);
        String triangleType = triangle.getType();
        assertEquals("Equilateral", triangleType);
    }

    @Test
    public void givenSameValuesToABButNotSameForCWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 10;
        double b = 10;
        double c = 5;
        Triangle triangle = new Triangle(a,b,c);
        String triangleType = triangle.getType();
        assertEquals("Isosceles", triangleType);
    }

    @Test
    public void givenSameValuesToACButNotSameForBWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 10;
        double b = 5;
        double c = 10;
        Triangle triangle = new Triangle(a,b,c);
        String triangleType = triangle.getType();
        assertEquals("Isosceles", triangleType);
    }

    @Test
    public void givenDifferentValuesToABCWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 4;
        double b = 5;
        double c = 6;
        Triangle triangle = new Triangle(a,b,c);
        String triangleType = triangle.getType();
        assertEquals("Scalene", triangleType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInvalidValueForAWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        Triangle t = new Triangle(0, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForBWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        Triangle t = new Triangle(1, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForCWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        Triangle t = new Triangle(1, 2, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForABCWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        Triangle t = new Triangle(0, -2, -10);
    }


}
