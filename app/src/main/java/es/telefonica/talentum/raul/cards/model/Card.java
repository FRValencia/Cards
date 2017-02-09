package es.telefonica.talentum.raul.cards.model;

//spades (♠), hearts (♥), diamonds (♦) and clubs (♣)

public class Card {
    public enum Suit{                                                                               //enumeramos los palos de la baraja
        SPADES,
        HEARTS,
        DIAMODS,
        CLUBS
    }

    private Suit suit;                                                                              //baraja
    private String image;                                                                           //foto de la carta


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
