package Chapter7;

//import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards(); // creates deck of cards with 52 cards
        myDeck.shuffleCard(); // shuffles / rearranges all 52 cards

        for (int i = 1; i <= 52; i++) { // prints the cards showing the order in which they were shuffled
            System.out.printf("%-19s", myDeck.dealCard());
            if (i % 4 == 0) {
                System.out.println(); // outputs a new line after every 4 cards
            }
        }
    }

}