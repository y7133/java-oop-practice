package domain;

public class Card {
    String pattern;
    String character;

    public Card(String pattern, String character) {
        this.pattern = pattern;
        this.character = character;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getPattern() {
        return pattern;
    }

    public String getCharacter() {
        return character;
    }


}
