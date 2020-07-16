package java_regular.data.type.enums.example4;

public class DeckMain {
    private static Card[] cardArr = new Card[52];

    public static void main(String[] args) {
        DeckMain main = new DeckMain();
        main.populateDeck();

        for (Card card: cardArr) {
            System.out.println(card.toString());
        }
    }

    private void populateDeck() {
        int i = 0;

        for (SuitEnum suit : SuitEnum.values()) {
            for (RankEnum rank : RankEnum.values()) {
                cardArr[i++] = new Card(rank, suit);
            }
        }
    }
}
