package com.tdd;

/**
 * Created by Sylvester on 3/4/2017.
 */
public class Dollar {
    int amount;
    Dollar(int amount) {
        this.amount = amount;

    }
    void times(int multiplier) {
        amount *= multiplier;
    }
}
