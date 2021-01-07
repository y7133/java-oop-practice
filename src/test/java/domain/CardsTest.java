package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardsTest {

    @Test
    @DisplayName("Make Cards")
    void createCard(){
        List<Card> cardList= new ArrayList<>();
        Cards cards = new Cards(cardList);
        assertEquals(cardList.size(),52);
        for(int i=0;i<cards.getCards().size();i++) {
            System.out.println(cards.getCards().get(i).getCardShape().getShape());
            System.out.println(cards.getCards().get(i).getPattern().getName());
        }
    }


}
