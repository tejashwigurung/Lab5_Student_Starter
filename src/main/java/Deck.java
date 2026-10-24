import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public int getSize() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public ArrayList<Card> dealCards(int n) {
        if (n < 0 || n > cards.size()) {
            throw new IllegalArgumentException("Cannot deal " + n + " cards");
        }
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            hand.add(dealCard());
        }
        return hand;
    }
}
