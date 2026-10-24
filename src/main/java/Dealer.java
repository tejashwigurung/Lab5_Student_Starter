import java.util.ArrayList;

public class Dealer {
    // TODO: Declare a private final ArrayList<Card> named hand.
    private final ArrayList<Card> hand;

    public Dealer() {
        // TODO: Initialize the dealer's empty hand.
        hand = new ArrayList<Card>();
    }

    public void receiveCard(Card card) {
        // TODO: Add a non-null card to the dealer's hand.
        if (card != null) {
            hand.add(card);
        }
    }

    public ArrayList<Card> getHand() {
        // TODO: Return the dealer's hand.
        return hand;
    }

    public int getHandTotal() {
        // TODO: Add Blackjack values for all cards.
        // Number cards use their number; Jack, Queen, and King are 10.
        // Count each Ace as 11, then change Aces to 1 as needed to avoid a bust.
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < hand.size(); i++) {
            Card currentCard = hand.get(i);
            String rank = currentCard.getRank();

            if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
                total = total + 10;
            } else if (rank.equals("Ace")) {
                total = total + 11;
                aceCount = aceCount + 1;
            } else {
                total = total + Integer.parseInt(rank);
            }
        }
            while (total > 21 && aceCount > 0) {
                total = total - 10;
                aceCount = aceCount - 1;
            }

            return total;
    }

    public void playTurn(Deck deck) {
        // TODO: While the hand total is below 17, deal one card from the deck.
        // Stop if the deck is empty. The dealer stands on soft or hard 17.
        while (getHandTotal() < 17) {
            if (deck.getSize() == 0) {
                break;
            }
            Card dealtCard = deck.dealCard();
            receiveCard(dealtCard);
        }
    }
}
