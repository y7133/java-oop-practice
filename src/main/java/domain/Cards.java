package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    private List<Card> cards = new ArrayList<>();

    Cards(List<Card> cards) {
        this.cards=cards;
    }
    public List<Card> toList(Card card){
        cards.add(card);
        return cards;
    }

    public List<Card> create(){
        for(Pattern pattern: Pattern.values()){
            createByPattern(cards,pattern);
        }
        return Collections.unmodifiableList(cards);
    }

    public List<Card> getCards(){
        return Collections.unmodifiableList(cards);
    }
    private void createByPattern(List<Card> cards, Pattern pattern){
        for(CardShape cardShape:CardShape.values()){
            cards.add(new Card(cardShape,pattern));
        }
    }



}
