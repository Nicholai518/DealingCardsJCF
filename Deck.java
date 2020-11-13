package sample;

import java.util.*;

public class Deck
{
    // Fields
   // private List<Card> cardDeck = new ArrayList<>();
    private LinkedList<Card> cardDeckForGame = new LinkedList();

    // Constructors
    public Deck()
    {
//
        // Hearts
        cardDeckForGame.addLast(new Card("Hearts", "Two"));
        cardDeckForGame.addLast(new Card("Hearts", "Three"));
        cardDeckForGame.addLast(new Card("Hearts", "Four"));
        cardDeckForGame.addLast(new Card("Hearts", "Five"));
        cardDeckForGame.addLast(new Card("Hearts", "Six"));
        cardDeckForGame.addLast(new Card("Hearts", "Seven"));
        cardDeckForGame.addLast(new Card("Hearts", "Eight"));
        cardDeckForGame.addLast(new Card("Hearts", "Nine"));
        cardDeckForGame.addLast(new Card("Hearts", "Ten"));
        cardDeckForGame.addLast(new Card("Hearts", "Jack"));
        cardDeckForGame.addLast(new Card("Hearts", "Queen"));
        cardDeckForGame.addLast(new Card("Hearts", "King"));
        cardDeckForGame.addLast(new Card("Hearts", "Ace"));

        // Diamonds
        cardDeckForGame.addLast(new Card("Diamonds", "Two"));
        cardDeckForGame.addLast(new Card("Diamonds", "Three"));
        cardDeckForGame.addLast(new Card("Diamonds", "Four"));
        cardDeckForGame.addLast(new Card("Diamonds", "Five"));
        cardDeckForGame.addLast(new Card("Diamonds", "Six"));
        cardDeckForGame.addLast(new Card("Diamonds", "Seven"));
        cardDeckForGame.addLast(new Card("Diamonds", "Eight"));
        cardDeckForGame.addLast(new Card("Diamonds", "Nine"));
        cardDeckForGame.addLast(new Card("Diamonds", "Ten"));
        cardDeckForGame.addLast(new Card("Diamonds", "Jack"));
        cardDeckForGame.addLast(new Card("Diamonds", "Queen"));
        cardDeckForGame.addLast(new Card("Diamonds", "King"));
        cardDeckForGame.addLast(new Card("Diamonds", "Ace"));

        // Spades
        cardDeckForGame.addLast(new Card("Spades", "Two"));
        cardDeckForGame.addLast(new Card("Spades", "Three"));
        cardDeckForGame.addLast(new Card("Spades", "Four"));
        cardDeckForGame.addLast(new Card("Spades", "Five"));
        cardDeckForGame.addLast(new Card("Spades", "Six"));
        cardDeckForGame.addLast(new Card("Spades", "Seven"));
        cardDeckForGame.addLast(new Card("Spades", "Eight"));
        cardDeckForGame.addLast(new Card("Spades", "Nine"));
        cardDeckForGame.addLast(new Card("Spades", "Ten"));
        cardDeckForGame.addLast(new Card("Spades", "Jack"));
        cardDeckForGame.addLast(new Card("Spades", "Queen"));
        cardDeckForGame.addLast(new Card("Spades", "King"));
        cardDeckForGame.addLast(new Card("Spades", "Ace"));

        // Clubs
        cardDeckForGame.addLast(new Card("Clubs", "Two"));
        cardDeckForGame.addLast(new Card("Clubs", "Three"));
        cardDeckForGame.addLast(new Card("Clubs", "Four"));
        cardDeckForGame.addLast(new Card("Clubs", "Five"));
        cardDeckForGame.addLast(new Card("Clubs", "Six"));
        cardDeckForGame.addLast(new Card("Clubs", "Seven"));
        cardDeckForGame.addLast(new Card("Clubs", "Eight"));
        cardDeckForGame.addLast(new Card("Clubs", "Nine"));
        cardDeckForGame.addLast(new Card("Clubs", "Ten"));
        cardDeckForGame.addLast(new Card("Clubs", "Jack"));
        cardDeckForGame.addLast(new Card("Clubs", "Queen"));
        cardDeckForGame.addLast(new Card("Clubs", "King"));
        cardDeckForGame.addLast(new Card("Clubs", "Ace"));


    }

    // Methods
    public void shuffleDeck()
    {
        Collections.shuffle(cardDeckForGame);
    }

    public Card deal()
    {
        return cardDeckForGame.removeFirst();
    }
}
