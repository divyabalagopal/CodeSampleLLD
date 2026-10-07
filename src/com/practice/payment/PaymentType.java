package com.practice.payment;

// What the customer picks on screen. Just a label, so an enum.
// The factory turns this label into a real PaymentStrategy object.
public enum PaymentType {
    UPI,
    CARD,
    CASH
}
