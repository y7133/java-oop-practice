package domain;
import java.util.List;

public interface Player {
    public Cards openCard();
    public void firstPick(CardDeck cardDeck);
    public void addCard(CardDeck cardDeck);
}
