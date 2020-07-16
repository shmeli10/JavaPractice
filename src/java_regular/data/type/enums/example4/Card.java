package java_regular.data.type.enums.example4;

public class Card {
    private final RankEnum rank;
    private final SuitEnum suit;

    public Card(RankEnum rank, SuitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public SuitEnum getSuit() {
        return suit;
    }

    public RankEnum getRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
