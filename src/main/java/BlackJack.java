import domain.*;
import ui.Game;

import java.util.ArrayList;
import java.util.List;

public class BlackJack {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        CardDeck cardDeck = new CardDeck();
        List<Card> dealerCardList = new ArrayList<>();
        List<Card> gamerCardList = new ArrayList<>();
        Dealer dealer=new Dealer(dealerCardList);
        Gamer gamer=new Gamer(gamerCardList);
        Rule rule=new Rule();
        gamer.firstPick(cardDeck);
        dealer.firstPick(cardDeck);
        dealer.pick(cardDeck);
        rule.Winner(dealer,gamer);
    }
}
