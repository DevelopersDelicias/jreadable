package org.developersdelicias.jreadable;


class JReadable {

    private final int numberToCompare;
    private int minRange;

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    static JReadable valueOf(int numberToCompare) {
        return new JReadable(numberToCompare);
    }

    JReadable isBetween(int minRange) {
        this.minRange = minRange;
        return this;
    }

    boolean and(int maxRange) {
        return numberToCompare >= minRange && numberToCompare <= maxRange;
    }
}
