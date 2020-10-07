package domain;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards = new ArrayList<>();

    public CardDeck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void generatedCardDeckByPattern(String pattern){

        String denomination = null;

        for(int i = 0; i < 14; i++){
            if(i == 0) denomination = "A";
            if(i == 11) denomination = "J";
            if(i == 12) denomination = "Q";
            if(i == 13) denomination = "K";
            denomination = String.valueOf(i);
            Card card = new Card(CardSuit.valueOf(pattern), denomination);
            this.cards.add(card);
        }
    }
}
