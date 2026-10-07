package com.practice.payment;

/**
 * CONCRETE STRATEGY #2.
 */
public class CardPayment implements PaymentStrategy {

    @Override
    public PaymentStatus pay(double amount) {
        // TODO 3: print "Charging card Rs <amount>"
        System.out.println("Charging card Rs: " + amount);
        // TODO 4: pretend the bank declines amounts above 5000 -> return FAILED,

        if(amount > 5000)
        {
            return PaymentStatus.FAILED;
        }
        //         otherwise return SUCCESS
        return PaymentStatus.SUCCESS; // placeholder
    }
}
