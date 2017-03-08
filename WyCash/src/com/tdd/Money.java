package com.tdd;

/**
 * Created by sylvesterharvey on 3/7/17.
 */
public class Money {
    protected int amount;
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
