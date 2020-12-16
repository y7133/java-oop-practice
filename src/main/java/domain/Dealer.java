package domain;
import java.util.ArrayList;
import java.util.List;

public class Dealer implements Player{

    Cards dealerCards;
    List<Card> dealerCardList= new ArrayList<>();
    private static final int MAX_CARD=3;


    public Dealer() {
        dealerCards = new Cards(dealerCardList);
    }
    public Dealer(Cards dealerCards){
        this.dealerCards=dealerCards;
    }
    @Override
    public Cards openCard(){
        return dealerCards;
    }

    @Override
    public void addCard(CardDeck cardDeck){
        if(dealerCards.getCards().size()<MAX_CARD)
            dealerCards.toList(cardDeck.pick());
    }
    @Override
    public void firstPick(CardDeck cardDeck){
        dealerCards.toList(cardDeck.pick());
        dealerCards.toList(cardDeck.pick());
        System.out.println("Dealer first Point: "+dealerCards.getCards().get(0).getPattern().getScore());
        System.out.println("Dealer Second Point: "+dealerCards.getCards().get(1).getPattern().getScore());
    }
    public void additionalPick(Rule rule,CardDeck cardDeck){
        if(rule.choosePick(dealerCards))
            dealerCards.toList(cardDeck.pick());
        System.out.println("Dealer Additional Point: "+dealerCards.getCards().get(2).getPattern().getScore());
    }
}
