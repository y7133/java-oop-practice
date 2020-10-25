package domain;

import ui.Game;

import java.util.List;

public class Rule {
    public int dealerPoint=0;
    public int gamerPoint=0;
    public Rule() {
        this.dealerPoint = 0;
        this.gamerPoint = 0;
    }
    public void Winner(Dealer dealer,Gamer gamer){
        dealerPoint=dealer.dealerTotal;
        gamerPoint=gamer.gamerTotal;
        System.out.println("gamerPoint: "+gamerPoint);
        System.out.println("dealerPoint: "+dealerPoint);
        for(Card card: dealer.dealer_cards)
            System.out.println(card.getPoint());
        if(dealerPoint>21)
            dealerPoint=0;
        if(gamerPoint>21)
            gamerPoint=0;
        if(dealerPoint>gamerPoint)
            System.out.println("Dealer is winner");
        else if(dealerPoint==gamerPoint) {
            System.out.println("Draw");
        }
        else {
            System.out.println("Gamer is winner");
        }
    }



}
