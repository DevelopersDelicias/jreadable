package org.developersdelicias.jreadable;

import java.util.Objects;

class JReadable {

    private Object object;
    private int numberToCompare;
    private int minRange;

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    public JReadable(Object object) {
        this.object = object;
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

    static JReadable object(Object object) {
        return new JReadable(object);
    }

    boolean isNull() {
        return Objects.isNull(object);
    }
}
