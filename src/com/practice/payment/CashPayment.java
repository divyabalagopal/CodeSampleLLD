package com.practice.payment;

/**
 * CONCRETE STRATEGY #3.
 * TODO 5: make this class implement PaymentStrategy and write pay():
 *         print "Collect Rs <amount> in cash" and return SUCCESS.
 */
public class CashPayment implements PaymentStrategy{

    @Override
    public PaymentStatus pay(double amount) {
        System.out.println("Collect Rs: " + amount + " in cash");
        return PaymentStatus.SUCCESS;
    }
}
