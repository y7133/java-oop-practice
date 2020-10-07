package domain;

public class Card {

    private CardSuit pattern;
    private String denomination;

    public Card(CardSuit pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public CardSuit getPattern() {
        return pattern;
    }

    public void setPattern(CardSuit pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
