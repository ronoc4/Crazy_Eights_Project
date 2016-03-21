package com.conor;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by conor on 3/6/16.
 */
public class Hand {
    //Create set of cards
    private ArrayList<Card> cards;

    //constructor
    public Hand() {
        cards = new ArrayList<Card>();
    }

    //methods for hand
    public void add(Card card) {
        cards.add(card);
    }

    //Clear current hand
    public void clear() {
        cards.clear();
    }

    //Show your hand
    public String showHand() {
        String str = "";

        for (Card c : cards) {
            str += c.toString();
        }

        return str;
    }


}
