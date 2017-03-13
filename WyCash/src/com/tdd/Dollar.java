package com.tdd;

/**
 * Created by Sylvester on 3/4/2017.
 */
public class Dollar extends Money {
    private String currency;
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    //Money times(int multiplier) {
    //    return Money.dollar(amount * multiplier);
    //}
    //Money times(int multiplier) {
    //    return new Money(amount * multiplier, currency);
    //}
    String currency() {
        return "USD";
    }
}
