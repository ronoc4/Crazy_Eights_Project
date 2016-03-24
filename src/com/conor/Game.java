package com.conor;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playAgain;

            System.out.println("Do you want to play a game of Crazy Eights? Select Y or N");
            playAgain = scanner.nextLine();

            if(playAgain.equalsIgnoreCase("Y")) {

                //Creating deck
                Deck d1 = new Deck();
                d1.populateDeck();
                d1.shuffle();

                //Create hands
                Hand Player, Computer;
                Player = new Hand();
                Computer = new Hand();
                Hand[] playerHand = {Player};
                Hand[] computerHand = {Computer};

                //Deal cards to hands
                d1.deal(playerHand, 7); //2nd number is total cards in hand
                d1.deal(computerHand, 7);

                //Show player hand
                for (int i = 0; i < playerHand.length; i++) {
                    System.out.println("Player hand: " + "\n" + playerHand[i].showHand());
                }

                for (int i = 0; i < computerHand.length; i++) {
                    System.out.println("\n" + "Computer hand: " + "\n" + computerHand[i].showHand());
                }
                
            }

            else {
                System.out.println("Have a nice day!");
            }

        scanner.close();

    }
}
