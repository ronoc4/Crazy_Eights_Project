package com.conor;

/**
 * Created by conor on 3/6/16.
 */
public enum Suit {
    //Enum is a class in Java
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    //Final = constant
    private final String suitText;

    //Constructor
    private Suit (String suitText) {
        this.suitText = suitText;
    }

    public String printSuitText() {
        return suitText;
    }

}
