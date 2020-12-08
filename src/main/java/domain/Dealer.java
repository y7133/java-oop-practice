package domain;

import java.util.List;

public class Dealer implements Player{

    List<Card> dealerCards;
    private static final int MAX_CARD=3;
    private static final int BOUNDARY_VALUE=17;
    public int dealerTotal;

    public Dealer(List<Card> dealerCards) {
        this.dealerCards = dealerCards;
        this.dealerTotal=0;
    }
    @Override
    public List<Card> openCard(){
        return dealerCards;
    }

    @Override   //카드 2장을 초기에 뽑음
    public void firstPick(CardDeck cardDeck){
        dealerCards.add(cardDeck.pickAndRemove());
        dealerCards.add(cardDeck.pickAndRemove());
        total(dealerCards);
    }

    //카드값(16초과한지 계산)
    @Override
    public void total(List<Card> cards){
        cards= dealerCards;
        for(Card card:cards)
            this.dealerTotal+=card.getPoint();
    }

    //포인트가 16이하여서 한번 더 뽑음
    public void pick(CardDeck cardDeck){
        if(this.dealerTotal<BOUNDARY_VALUE&&!isOverCardSize()) {
            dealerCards.add(cardDeck.pickAndRemove());
            this.dealerTotal+= dealerCards.get(lastCardIndex()).getPoint();
        }
    }

    private int lastCardIndex(){
        return dealerCards.size()-1;
    }

    //카드 수 초과하였는지 확인
    public boolean isOverCardSize(){
        if(dealerCards.size()>=MAX_CARD)
            throw new IllegalArgumentException("받을 수 있는 카드 수 초과");
        return false;
    }
}
