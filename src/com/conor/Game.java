package com.conor;

public class Game {

    public static void main(String[] args) {
        Card c1, c2;

        c1 = new Card(Value.ACE, Suit.HEARTS);
        c2 = new Card(Value.JACK, Suit.HEARTS);

        System.out.println(c1.toString() + "\n" + c2.toString() );


    }
}
