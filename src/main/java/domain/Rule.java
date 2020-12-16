package domain;
public class Rule {
    private static final int BOUNDARY_VALUE=17;
    public void winner(Dealer dealer,Gamer gamer){
        int dealerPoint=sumOfcard(dealer.openCard());
        int gamerPoint=sumOfcard(gamer.openCard());
        System.out.println("dealerPoint: "+dealerPoint);
        System.out.println("gamerPoint: "+gamerPoint);
        if(gamerPoint>dealerPoint)
            System.out.println("Gamer is winner");
        else if(gamerPoint==dealerPoint)
            System.out.println("Draw");
        else
            System.out.println("Dealer is winner");
    }

    public int sumOfcard(Cards cardList){
        int sum=0;
        for(int i=0;i<cardList.getCards().size();i++)
            sum+=cardList.getCards().get(i).getPattern().getScore();

        return isOver(sum);
    }
    public boolean choosePick(Cards cardList){
        if(sumOfcard(cardList)<BOUNDARY_VALUE)
            return true;
        return false;
    }
    private int isOver(int sum){
        if(sum>21)
            return -1;
        else return sum;
    }
}
