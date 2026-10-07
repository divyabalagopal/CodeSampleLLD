package com.practice.payment;

/**
 * CONCRETE STRATEGY #1.
 * Keep it STATELESS: no fields that change per customer.
 */
public class UpiPayment implements PaymentStrategy {

    @Override
    public PaymentStatus pay(double amount) {
        // TODO 1: print something like "Generating UPI QR for Rs <amount>"
        System.out.println("Generating UPI QR for Rs: " + amount);
        // TODO 2: return PaymentStatus.SUCCESS
        return PaymentStatus.SUCCESS; // placeholder so the project compiles
    }
}
