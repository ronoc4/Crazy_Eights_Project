package com.conor;

import java.util.ArrayList;

/**
 * Created by conor on 3/6/16.
 *
 */

//Super class to create deck
public class Hand {

    //Create set of cards
    protected ArrayList<Card> cards;

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

    //Show your hand and totals
    public String showHand() {
        String str = "";

        for (Card c : cards) {
            str += c.toString() + "\n"; //print each on new line
        }
        return str;
    }

    public boolean giveCard(Card card, Hand otherHand) {
        if(cards.contains(card)) {
            int i = cards.indexOf(card);
            cards.remove(i);
            otherHand.add(card);
            return true;
        } else {
            return false;
        }
    }

    //Return total points of hand
    public int getTotal() {
        int totalPoints = 0;
        for(int i = 0; i < cards.size(); i++) {
            totalPoints += cards.get(i).getValue();
        }
        return totalPoints;
    }

    @Override
    public String toString(){
        String str = "";
        //loop through all cards
        for(Card card: cards) {
            str += card.toString() + "\n";
        }
        return str;
    }

}
