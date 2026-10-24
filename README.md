# Lab Assignment 5 — The Dealer

**COMP 1050 — Computer Science II**

This project continues Blackjack Part 1. `Card.java` and `Deck.java` are complete; implement the TODOs in `Dealer.java` and `Main.java`. Do not rename classes or change public method signatures.

## Required behavior

- `Dealer` stores an `ArrayList<Card>` hand.
- `receiveCard(Card)` adds a card to the hand.
- `getHand()` returns the dealer's hand.
- `getHandTotal()` applies Blackjack values: number cards use their number, face cards are 10, and aces are 11 unless changing one or more to 1 prevents a bust.
- `playTurn(Deck)` draws while the total is below 17 and stops on soft or hard 17. It must also stop safely if the deck is empty.
- `Main` shuffles a deck, deals exactly two starting cards, shows the hand and total, displays each hit, and ends with `Dealer stands.`

## Open and test

1. Extract the ZIP.
2. In IntelliJ IDEA choose **File → Open** and select the folder containing `pom.xml`.
3. Load the Maven project and select JDK 17 or newer.
4. Run `DealerTest`, then run `Main` several times.

## Submit to Gradescope

Submit `Card.java`, `Deck.java`, `Dealer.java`, and `Main.java`, either directly or in one ZIP. Confirm the autograder finds all four files and runs on your latest code.
