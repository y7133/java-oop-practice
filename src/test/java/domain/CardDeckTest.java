package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardDeckTest {

    //카드 섞는 것
    @Test
    void CardShuffle(){
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.cardList.get(0).getCardShape().getShape());
        System.out.println(cardDeck.cardList.get(0).getPattern().getName());
    }

    //카드 뽑고 제거
    @Test
    void cardPick(){
        CardDeck cardDeck = new CardDeck();
        Card card = cardDeck.cardList.get(0);
        Assertions.assertEquals(cardDeck.pick(),card);
        Assertions.assertEquals(cardDeck.cardList.contains(card),false);
    }

}
