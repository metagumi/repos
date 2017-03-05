package com.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Sylvester on 3/4/2017.
 */
@Test
public class DollarTest {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

}