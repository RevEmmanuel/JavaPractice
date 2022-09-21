package Chapter7;

import java.security.SecureRandom;

public class DeckOfCards {
    // Deck of cards represents a deck of playing cards

    SecureRandom random = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constant number of cards

    private Card[] deck = new Card[NUMBER_OF_CARDS]; // previous card class reference
    private int currentCard = 0; // index of next Card to be dealt (0-51). index is the position inside array

    // constructor does not contain any parameters
    public DeckOfCards() {
        // list out all the faces to give them to cards
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        // list out all the suits to give them to cards
        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};

        for (int count = 0; count < deck.length; count++) {
            // give each card a face and suit. it only gives a face and suit to 13 cards
            deck[count] = new Card(faces[count % 13], suit[count / 13]);
        }
    }

    public void shuffleCard () {
        // start dealing from the first card index (0)
        currentCard = 0;

        for (int counter = 0; counter < deck.length; counter++) {
            // select a random number between 0 and 51
            int second = random.nextInt(NUMBER_OF_CARDS);

            // create a temporary card object to hold the value of the first card i.e. card in the index (counter)
            Card temp = deck[counter];
            // assign the value of that card to the temporary card object

            deck[counter] = deck[second];
            // put the value of the card generated inside the first card that you stored its value in temporary card

            // put the original value of the first card inside the second card
            deck[second] = temp;
            // you have just swapped the value(content) of the two cards. it is also shuffling
        }
    }

    public Card dealCard() { // method to deal (show / distribute) card
        if (currentCard < deck.length) { // determines if cards remain to be dealt
            return deck[currentCard++]; // return the value of the current card in the array
        }
        else {
            return null; // returns nothing if no cards remain
        }

    }
}
