package com.tradeshift.entities;

import org.junit.Test;

/**
 * Created by js on 10/19/16.
 */
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
}
