package com.conor;

public class Game {

    public static void main(String[] args) {

        //Creating deck
        Deck d1 = new Deck();
        d1.populateDeck();
        d1.shuffle();

        //Create hand
        Hand h1, h2;
        h1 = new Hand();
        h2 = new Hand();
        Hand[] hands = {h1, h2};

        //Deal cards to hands
        d1.deal(hands, 7); //2nd number is total cards in hand

        //Show players hands
        for (int i= 0; i < hands.length; i++) {
            System.out.println(hands[i].showHand());
        }


    }
}
