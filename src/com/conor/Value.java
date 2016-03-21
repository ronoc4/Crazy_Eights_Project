package com.conor;

/**
 * Created by conor on 3/6/16.
 */
public enum Value {
    TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"),
    SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"),
    TEN(10, "Ten"), JACK(10, "Jack"), QUEEN(10, "Queen"),
    KING(10, "King"), ACE(11, "Ace");

    //Private field
    private final int valueInt;
    private final String valueString;

    //Contructor
    private Value(int valueInt, String valueString) {
        this.valueInt = valueInt;
        this.valueString = valueString;
    }

    public int getValueInt() {
        return valueInt;
    }

    public String printValue() {
        return valueString;
    }
}
