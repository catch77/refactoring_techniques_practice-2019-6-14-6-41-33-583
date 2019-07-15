package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return calculateBasePrice(quantity, itemPrice) -
                calculateDiscount(quantity, itemPrice) +
                calculateShippingCost(quantity, itemPrice);
    }

    private double calculateBasePrice(int quantity, int itemPrice) {
        return quantity * itemPrice;
    }

    private double calculateDiscount(int quantity, int itemPrice) {
        final double discount = 0.05;
        final int q = 500;
        return Math.max(0, quantity - q) * itemPrice * discount;
    }

    private double calculateShippingCost(int quantity, int itemPrice) {
        final double discount = 0.1;
        final double cost = 100.0;
        return Math.min(quantity * itemPrice * discount, cost);
    }

}
