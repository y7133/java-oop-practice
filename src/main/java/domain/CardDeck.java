package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    //List<Card>  cardList = new ArrayList<>();
    private Cards cards;
    //Cards cards;
    public CardDeck(Cards cards) {
        this.cards = cards;
        cardShuffle();
    }

    private void cardShuffle(){
        cards.create();
        Collections.shuffle(cards.getCards());
    }


    public Card pick(){
        Card card = cards.toList().get(0);
        remove(card);
        return card;
    }

    public void remove(Card card){

        cards.getCards().remove(card);
    }

}
