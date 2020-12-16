package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    List<Card>  cardList = new ArrayList<>();
    Cards cards;
    //Cards cards;
    public CardDeck() {
        cardShuffle();
    }

    private void cardShuffle(){
        cards = new Cards(cardList);
        cards.create();
        Collections.shuffle(cardList);
    }


    public Card pick(){
        Card card = cardList.get(0);
        remove(card);
        return card;
    }

    public void remove(Card card){
        cardList.remove(cardList.get(0));
    }

}
