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
        TriangleType triangleType = triangle.getType();
        assertEquals(TriangleType.EQUILATERAL, triangleType);
    }

    @Test
    public void givenSameValuesToABButNotSameForCWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 10;
        double b = 10;
        double c = 5;
        Triangle triangle = new Triangle(a,b,c);
        TriangleType triangleType = triangle.getType();
        assertEquals(TriangleType.ISOSCELES, triangleType);
    }

    @Test
    public void givenSameValuesToACButNotSameForBWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 10;
        double b = 5;
        double c = 10;
        Triangle triangle = new Triangle(a,b,c);
        TriangleType triangleType = triangle.getType();
        assertEquals(TriangleType.ISOSCELES, triangleType);
    }

    @Test
    public void givenSameValuesToBCButNotSameForAWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 5;
        double b = 10;
        double c = 10;
        Triangle triangle = new Triangle(a,b,c);
        TriangleType triangleType = triangle.getType();
        assertEquals(TriangleType.ISOSCELES, triangleType);
    }

    @Test
    public void givenDifferentValuesToABCWhenGetTriangleTypeThenShouldReturnIsosceles(){
        double a = 4;
        double b = 5;
        double c = 6;
        Triangle triangle = new Triangle(a,b,c);
        TriangleType triangleType = triangle.getType();
        assertEquals(TriangleType.SCALENE, triangleType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInvalidValueForAWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        new Triangle(0, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForBWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        new Triangle(1, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForCWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
        new Triangle(1, 2, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void GivenInvalidValueForABCWhenCreateNewInstanceShouldThrowIllegalArgumentException(){
       new Triangle(0, -2, -10);
    }


}
