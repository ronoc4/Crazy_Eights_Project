package com.conor;

/**
 * Created by conor on 3/6/16.
 *
 */
public class Card {

    //Create private fields for Card

    private Suit suit;
    private Value value;

    //Contrsuctor for card class
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    //Public methods
    public String getSuit() {
        return suit.printSuitText();
    }

    public int getValue() {
        return value.getValueInt();
    }

    public String toString() {
        String str = "";
        str += value.printValue() + " of " +
                suit.printSuitText();
        return str;
    }
}
