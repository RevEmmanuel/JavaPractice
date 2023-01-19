package Chapter7;

public class Card {
    // cards.Card class represents a playing card
    private String face; // face can be Ace, King, Queen, etc
    private String suit; // suit can be Spades, Clubs, Diamond or Hearts


    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    // return String representation of card
    public String toString() {
        return face + " of " + suit;
    }
}
