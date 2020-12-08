package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cards {
    private final List<Card> cards;
    Cards(List<Card>cards){
        this.cards=cards;
    }
    Cards removeCard(){
        return cards.remove(1);
    }
}
