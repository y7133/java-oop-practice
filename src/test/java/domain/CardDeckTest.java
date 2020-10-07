package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

class CardDeckTest {

    @ParameterizedTest
    @ValueSource(strings = {"SPADE", "HEART", "DIAMOND", "CLUB"})
    @DisplayName("초기 카드덱 초기화")
    public void 문양별_카드덱_만들기(String pattern){

        List<Card> cards = new ArrayList<>();
        String denomination = null;

        for(int i = 0; i < 14; i++){
            if(i == 0) denomination = "A";
            if(i == 11) denomination = "J";
            if(i == 12) denomination = "Q";
            if(i == 13) denomination = "K";
            denomination = String.valueOf(i);
            Card card = new Card(CardSuit.valueOf(pattern), denomination);
            cards.add(card);
        }
        CardDeck cardDeck = new CardDeck(cards);
        assertSame(cardDeck.getCards().get(0), cards.get(0));
    }
}