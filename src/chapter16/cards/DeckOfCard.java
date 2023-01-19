package chapter16.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCard {

    private final List<Card> deck;

    public DeckOfCard() {
        Card[] decks = new Card[52];
        int count = 0;

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                decks[count++] = new Card(face, suit);
            }
        }

        deck = Arrays.asList(decks);
        Collections.shuffle(deck);
    }

    public void printCards() {
        System.out.println("Cards: ");
        for (int i = 0; i < deck.size(); i++) {
            System.out.printf("%s   ", deck.get(i));
            if ((i + 1) % 4 == 0) System.out.println();
        }
    }
}
