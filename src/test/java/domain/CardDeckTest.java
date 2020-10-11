package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

public class CardDeckTest {


    @ParameterizedTest
    @ValueSource(strings = {"SPADE","HEART","DIAMOND","CLUB"})
    @DisplayName("Carddeck")
    public void Carddeck(String pattern){
        String character;
        List<Card> cards=new ArrayList<>();
        int count=0;
            for (int i = 0; i < 14; i++) {
                if (i == 0)
                    character = "A";
                else if (i == 11)
                    character = "J";
                else if (i == 12)
                    character = "Q";
                else if (i == 13)
                    character = "K";
                else
                    character = String.valueOf(i);
                Card card = new Card(pattern,character);
                cards.add(card);
                count++;
            }
            CardDeck cardDeck = new CardDeck(cards,count);
            for(int i=0;i<14;i++) {
                System.out.print(cardDeck.getCards().get(i).getPattern());
                System.out.print(" ");
                System.out.print(cardDeck.getCards().get(i).getCharacter());
                System.out.print(" ");
            }
        System.out.println();
        System.out.println(cardDeck.getNumber_of_card());
    }
    @Test
    void Test(){

    }
}
