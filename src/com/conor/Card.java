package com.conor;

/**
 * Created by conor on 3/6/16.
 *
 */
public class Card {

    //Create private fields for Card

    private Suit suit;
    private Value value;
    public boolean isFaceUp;

    //Contrsuctor for card class
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        isFaceUp = true;
    }

    //Public methods
    public String getSuit() {
        return suit.printSuitText();
    }

    //Ability for card to get suit as rank string
    public String printSuit() {
        return suit.printSuitText();
    }

    public int getValue() {
        return value.getValueInt();
    }


    public void flipCard() {
        isFaceUp = !isFaceUp; //Reverse value of card
    }

    @Override
    public String toString() {
        String str = "";
        if (!isFaceUp) {
            //TODO check to make sure this is valid
            str += value.printValue() + " of " +
                    suit.printSuitText();
        } else {
            str = "Card is face down";
        }
        return str;
    }
}
