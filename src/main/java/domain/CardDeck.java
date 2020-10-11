package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDeck {

    List<Card> cards=new ArrayList<>();
    int number_of_card; //카드 갯수
    String[] pattern = {"SPADE","HEART","DIAMOND","CLUB"};

    public List<Card> getCards() {
        return cards;
    }
    public int getNumber_of_card() {
        return number_of_card;
    }

    public CardDeck(List<Card> cards,int number_of_card) {
        this.cards = cards;
        this.number_of_card=number_of_card;
    }

    //카드덱 만들기
    public void make_carddeck(){
        String character;
        int count=0;
        for(int j=0;j< pattern.length;j++) {
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
                Card card = new Card(pattern[j],character);
                count++;
                cards.add(card);
            }
        }
        this.number_of_card=count;
    }

    //카드덱에서 카드 한장 뽑기(인덱스 추출)
    public int draw_card_index(){
        Random random = new Random();
        return random.nextInt(this.number_of_card);
    }

    //카드덱에서 한장뽑고 해당 인덱스에 있는 카드 삭제
    public Card draw_card(int index){
        Card draw_card = cards.get(index);
        cards.remove(index);
        this.number_of_card--;
        return draw_card;
    }
}
