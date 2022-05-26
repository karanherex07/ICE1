/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author -Karandeep Singh---
 */
     import java.util.Random;
     import java.util.Scanner;
public class CardTrick {
     
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       rand.setSeed(System.currentTimeMillis());
        System.out.println("The cards in the magic hand are: ");
        for (int j = 0; j < c.length; j++) {
            Card s = new Card();
            s.setValue(rand.nextInt(13) + 1);
            s.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = s;
            System.out.println(s);
        }
        
          System.out.print("Enter card value: ");
        int val = scan.nextInt();
        System.out.print("Enter suit: ");
        String suit = scan.next();
        Card key = new Card();
        key.setValue(val);
        key.setSuit(suit);  
        // hard-coded answer for part 6 and 7
        Card keyW1 = new Card();
        
        key.setValue(11);
        key.setSuit("Hearts");
        boolean found = false;
        System.out.println("Searching for: " + key);
        for (int k = 0; i < c.length; k++) {
            if ((magicHand[i].getValue() == key.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(key.getSuit())) {
                System.out.println("Card is found in magic hand at index " + (i+1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");//c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
