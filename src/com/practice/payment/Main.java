package com.practice.payment;

/**
 * CLIENT.
 * Plays the part of the customer at the checkout screen.
 */
public class Main {

    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();   // one shared context

        // Customer 1 picks UPI
        PaymentStrategy upi = PaymentStrategyFactory.create(PaymentType.UPI);
        checkout.checkout("ORD-1", 300, upi);

        // TODO 9: Customer 2 picks CARD and pays 1200
        PaymentStrategy card = PaymentStrategyFactory.create(PaymentType.CARD);
        PaymentStrategy cash = PaymentStrategyFactory.create(PaymentType.CASH);
        checkout.checkout("ORD-2",1200,card);

        // TODO 10: Customer 3 picks CARD and pays 9000 (should FAIL, from TODO 4)
        checkout.checkout("ORD-3",9000,card);

        // TODO 11: Customer 4 picks CASH and pays 150
        checkout.checkout("ORD-4",150,cash);

    }
}
