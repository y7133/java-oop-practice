package domain;
public enum CardShape {
    SPADE("SPADE"),
    HEART( "HEART"),
    DIAMOND("DIAMOND"),
    CLUB("CLUB");

    private String shape;

    CardShape(String shape) {
        this.shape = shape;

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

}
