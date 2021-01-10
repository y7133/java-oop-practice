package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CardDeckTest {

    //카드 섞는 것
    @Test
    void CardShuffleTest(){
        List<Card> cardList = new ArrayList<>();
        Cards cards = new Cards(cardList);
        CardDeck cardDeck = new CardDeck(cards);
        System.out.println(cards.getCards().get(0).getCardShape().getShape());
        System.out.println(cards.getCards().get(0).getPattern().getName()); //cards안의 list자체가 섞임
    }

    //카드 뽑고 제거
    @Test
    void cardPickTest(){
        List<Card> cardList = new ArrayList<>();
        Cards cards = new Cards(cardList);
        CardDeck cardDeck = new CardDeck(cards);
        Card card = cardDeck.pick();
        Assertions.assertEquals(cards.getCards().contains(card),false);
    }

}
