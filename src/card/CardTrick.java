/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;


import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Nasir
 * @studentID 991770449
 * @date May 21, 2025
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        
        //Filling the magic hand with random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() *13 + 1));
            c.setSuit(suits[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        //Asking user to pick a card
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a card value (1 to 13): ");
        int userValue = input.nextInt();
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = input.nextInt();
        String userSuit = suits[suitIndex];
        
        // Checking if the card exists in magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }
        
        //Result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card was not found.");
        }
        
        //Showing the magic hand 
        System.out.println("\nMagic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        input.close();


        }
        
    }
    
