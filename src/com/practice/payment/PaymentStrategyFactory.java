package com.practice.payment;

/**
 * FACTORY.
 * The ONLY place that looks at PaymentType and decides which concrete class to create.
 * Everyone else works through the PaymentStrategy interface.
 */
public class PaymentStrategyFactory {

    public static PaymentStrategy create(PaymentType type) {
        // TODO 6: switch on type
        //   UPI  -> return new UpiPayment();
        //   CARD -> return new CardPayment();
        //   CASH -> return new CashPayment();   (works only after TODO 5)
        //   default -> throw new IllegalArgumentException("Unsupported: " + type);

        switch(type)
        {
            case UPI -> {
                return new UpiPayment();
            }
            case CARD -> {
                return new CardPayment();
            }
            case CASH ->
            {
                return new CashPayment();
            }
            default -> throw new UnsupportedOperationException("Select a valid payment method!");

        }
//        throw new UnsupportedOperationException("TODO 6: implement the factory");
    }
}
