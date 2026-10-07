package com.practice.payment;

/**
 * CONTEXT.
 * Uses a strategy but never knows which one it got.
 *
 * Notice: the strategy is a METHOD PARAMETER, not a field,
 * because each customer chooses their own payment method.
 */
public class CheckoutService {

    public void checkout(String orderId, double amount, PaymentStrategy strategy) {
        System.out.println("Order " + orderId + " | amount Rs " + amount);

        // TODO 7: call strategy.pay(amount) and store the PaymentStatus it returns
        PaymentStatus status = strategy.pay(amount);

        // TODO 8: if SUCCESS -> print "Order <orderId> confirmed"
        if( status == PaymentStatus.SUCCESS)
        {
            System.out.println("Order " + orderId +" is confirmed.");
        }
        else {
            System.out.println("Order " + orderId + " payment failed, please try again!");
        }
        //         else       -> print "Order <orderId> payment failed, order NOT confirmed"
    }
}
