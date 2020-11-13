package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardPlayer
{
    // Fields
    private LinkedList<Card> playerCards = new LinkedList<>();


    // Constructors
    public CardPlayer()
    {

    }

    // Methods
    public void getCard(Card card)
    {
        playerCards.addLast(card);
    }

    public LinkedList showCards()
    {
        return playerCards ;
    }

//    @Override
//    public String toString()
//    {
//        return "Suit: " +
//    }
}
