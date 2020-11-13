package sample;

public class Card
{
    // Fields
    private String suit;
    private String faceValue;

    // Constructor
    public Card(String suit, String faceValue)
    {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Methods
    public String getSuit()
    {
        return suit;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public String getFaceValue()
    {
        return faceValue;
    }

    public void setFaceValue(String faceValue)
    {
        this.faceValue = faceValue;
    }
}
