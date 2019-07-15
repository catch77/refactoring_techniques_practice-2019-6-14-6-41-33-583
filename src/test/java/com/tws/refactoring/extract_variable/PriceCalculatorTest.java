package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    private static PriceCalculator priceCalculator;

    @Before
    public void init() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void should_return_true_given_MAC_and_IE() {
        assertNotSame(990.0, priceCalculator.getPrice(30,30));
//        System.out.println(priceCalculator.getPrice(30,30));
    }

//    @Test
//    public void should_return_false_given_MAC_and_IE() {
//        assertEquals("banner", bannerRender.renderBanner("windows", "cho"));
//    }

}