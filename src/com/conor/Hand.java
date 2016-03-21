package com.conor;

import java.util.ArrayList;

/**
 * Created by conor on 3/6/16.
 *
 */
public class Hand {
    //Create set of cards
    private ArrayList<Card> cards;

    //constructor
    public Hand() {
        cards = new ArrayList<Card>();
    }

    //Clear current hand
    public void clear() {
        cards.clear();
    }

    //methods for hand
    public void add(Card card) {
        cards.add(card);
    }

    //Show your hand
    public String showHand() {
        String str = "";

        for (Card c : cards) {
            str += c.toString() + "\n"; //print each on new line
        }

        return str;
    }

    public boolean giveCard(Card card, Hand otherHand) {
        if(!cards.contains(card)) {
            return false;
        } else {
            //Get index of card in deck
            cards.remove(card);
            otherHand.add(card);
            return true;
        }
    }

}
