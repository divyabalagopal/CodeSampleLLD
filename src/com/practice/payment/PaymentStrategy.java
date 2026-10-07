package com.practice.payment;

/**
 * STRATEGY (the contract).
 * Every way of paying must be able to do this one thing.
 * The context only ever talks to this interface, never to a concrete class.
 */
public interface PaymentStrategy {

    PaymentStatus pay(double amount);
}
