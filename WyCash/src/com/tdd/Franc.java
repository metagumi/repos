package com.tdd;

/**
 * Created by sylvesterharvey on 3/6/17.
 */
public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
