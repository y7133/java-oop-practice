//package domain;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Gamer implements Player{
//    Cards gamerCards;
//    List<Card> gamerCardList= new ArrayList<>();
//    private static final int MAX_CARD=3;
//    private static final int BOUNDARY_VALUE=17;
//
//    public Gamer() {
//        gamerCards = new Cards(gamerCardList);
//    }
//    public Gamer(Cards gamerCards){
//        this.gamerCards=gamerCards;
//    }
//    @Override
//    public Cards openCard(){
//        return gamerCards;
//    }
//    @Override
//    public void addCard(CardDeck cardDeck){
//        gamerCards.toList(cardDeck.pick());
//    }
//    @Override
//    public void firstPick(CardDeck cardDeck){
//        gamerCards.toList(cardDeck.pick());
//        gamerCards.toList(cardDeck.pick());
//        System.out.println("Gamer First Point: "+gamerCards.getCards().get(0).getPattern().getScore());
//        System.out.println("Gamer Second Point: "+gamerCards.getCards().get(1).getPattern().getScore());
//    }
//}
