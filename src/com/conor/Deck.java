package com.conor;

import java.util.Random;

/**
 * Created by conor on 3/21/16.
 *
 */
public class Deck extends Hand{

    public void populateDeck() {
        /*
        * For suits in suits
        * set card to card with values and suits
        * */
        for(Suit suit: Suit.values()) { //Enum reference: http://stackoverflow.com/questions/13659217/where-is-the-documentation-for-the-values-method-of-enum
            for(Value value :Value.values()) {

                Card card = new Card(value, suit); //Create new card
                card.flipCard(); //Flip card
                this.add(card); //Add to card arraylist
            }
        }
    }

    //Shuffle the deck
    Random rand = new Random();
    public void shuffle() {

        for(int i = cards.size() - 1; i > 0; i--) { //Must take the size of deck and subtract to equal 52
            //Swap random card between beginning and end of deck
            //i represents the last card, pick
            int pick = rand.nextInt(i);
            Card randomCard = cards.get(pick);
            Card lastCard = cards.get(i);
            cards.set(i, randomCard); //End position of random card
            cards.set(pick, lastCard); //Last card where random card was
        }
    }

    //Deal cards method
    public void deal(Hand[] hands, int perHand) {
        for(int i = 0; i < perHand; i++ ) {
            for(int j = 0; j < hands.length; j++) {
                this.giveCard(cards.get(0), hands[j]); //pull off top of deck at index 0
            }
        }
    }

    public void flipCard(Card c) {
        c.flipCard();
    }

}
