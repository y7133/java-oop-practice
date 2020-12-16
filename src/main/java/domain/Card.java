package domain;

import java.util.Objects;

public class Card {

        public Pattern getPattern() {
            return pattern;
        }

        public CardShape getCardShape() {
            return cardShape;
        }

        private CardShape cardShape;
        private Pattern pattern;


        public Card(CardShape cardShape, Pattern pattern) {
            this.cardShape = cardShape;
            this.pattern = pattern;
        }


        public boolean isPatternEquals(Card card){
            return this.pattern.equals(card.pattern);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return cardShape == card.cardShape &&
                    pattern == card.pattern;
        }

        @Override
        public int hashCode() {
            return Objects.hash(cardShape, pattern);
        }

}
