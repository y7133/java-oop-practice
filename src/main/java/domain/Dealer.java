package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dealer implements Player{

    List<Card> dealer_cards= new ArrayList<>();
    private static final int MAX_CARD=3;
    public int dealerTotal=0;

    public Dealer(List<Card> dealer_cards) {
        this.dealer_cards=dealer_cards;
        this.dealerTotal=0;
    }
    @Override
    public List<Card> openCard(){
        return dealer_cards;
    }
    @Override
    public void firstPick(CardDeck cardDeck){
        dealer_cards.add(cardDeck.pickAndRemove());
        dealer_cards.add(cardDeck.pickAndRemove());
        total(dealer_cards);
    }

    @Override
    public void total(List<Card> cards){
        cards=dealer_cards;
        for(Card card:cards)
            this.dealerTotal+=card.getPoint();
    }
    public void pick(CardDeck cardDeck){

        if(this.dealerTotal<17&&!isOverCardSize()) {
            dealer_cards.add(cardDeck.pickAndRemove());
            this.dealerTotal+=dealer_cards.get(2).getPoint();
        }

    }
    public boolean isOverCardSize(){
        if(dealer_cards.size()>=MAX_CARD)
            throw new IllegalArgumentException("받을 수 있는 카드 수 초과");
        return false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Dealer)) return false;
//        Dealer dealer = (Dealer) o;
//        return dealer_cards.equals(dealer.dealer_cards) &&
//                rule.equals(dealer.rule);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(dealer_cards, rule);
//    }
}
