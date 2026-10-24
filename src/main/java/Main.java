public class Main {
    public static void main(String[] args) {
        // TODO: Create and shuffle a deck.
        Deck deck = new Deck();
        deck.shuffle();
        // TODO: Create a dealer and deal exactly two starting cards.
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
        // TODO: Print the starting hand and total.
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer total: " + dealer.getHandTotal());
        // TODO: Let the dealer play. Print "Dealer hits..." before each additional card.
        // TODO: Print the updated hand and total after every hit.
        while (dealer.getHandTotal() < 17) {
            if (deck.getSize() == 0) {
                break;
            }
            System.out.println("Dealer hits...");
            Card dealtCard = deck.dealCard();
            dealer.receiveCard(dealtCard);

            System.out.println("Dealer's hand: " + dealer.getHand());
            System.out.println("Dealer total: " + dealer.getHandTotal());
        }

        // TODO: Print "Dealer stands." after the dealer reaches 17 or higher.
        System.out.println("Dealer stands.");
    }
}
