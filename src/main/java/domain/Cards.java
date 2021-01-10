package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    private List<Card> cards = new ArrayList<>();

    public Cards(List<Card> cards) {
        this.cards=cards;
    }
    public List<Card> toList(){
        List<Card> cardList=new ArrayList<>();
        for(int i=0;i< cards.size();i++)
            cardList.add(cards.get(i));
        return cardList;
    }

    public List<Card> create(){
        for(Pattern pattern: Pattern.values()){
            createByPattern(cards,pattern);
        }
        return Collections.unmodifiableList(cards);
    }

    public List<Card> getCards(){
        return cards;
    }
    private void createByPattern(List<Card> cards, Pattern pattern){
        for(CardShape cardShape:CardShape.values()){
            cards.add(new Card(cardShape,pattern));
        }
    }



}
