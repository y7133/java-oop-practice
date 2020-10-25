package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gamer implements Player{


    public List<Card> gamercards=new ArrayList<>();
    public int gamerTotal;

    public Gamer(List<Card> gamercards) {
        this.gamercards = gamercards;
        this.gamerTotal=0;
    }
    @Override
    public List<Card> openCard(){
        return gamercards;
    }
    public void firstPick(CardDeck cardDeck){
        gamercards.add(cardDeck.pickAndRemove());
        gamercards.add(cardDeck.pickAndRemove());
        total(gamercards);
    }
    @Override
    public void total(List<Card> cards){
        cards=gamercards;
        for(Card card:cards) {
            this.gamerTotal += card.getPoint();
        }
    }
    public void pick(CardDeck cardDeck){
        gamercards.add(cardDeck.pickAndRemove());
        this.gamerTotal+=gamercards.get(gamercards.size()-1).getPoint();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gamer)) return false;
        Gamer gamer = (Gamer) o;
        return Objects.equals(gamercards, gamer.gamercards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamercards);
    }
}
