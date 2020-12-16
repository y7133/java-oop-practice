import domain.CardDeck;
import domain.Dealer;
import domain.Gamer;
import domain.Rule;
import ui.Game;

public class BlackJack {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        CardDeck cardDeck = new CardDeck();
        Dealer dealer=new Dealer();
        Gamer gamer=new Gamer();
        Rule rule=new Rule();
        gamer.firstPick(cardDeck);
        dealer.firstPick(cardDeck);
        dealer.additionalPick(rule,cardDeck);
        rule.winner(dealer,gamer);
    }
}
