package org.developersdelicias.jreadable;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;

class JReadable {

    private Object object;
    private int numberToCompare;
    private int firstNumber;

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    public JReadable(Object object) {
        this.object = object;
    }

    static JReadable valueOf(int numberToCompare) {
        return new JReadable(numberToCompare);
    }

    JReadable isBetween(int firstNumber) {
        this.firstNumber = firstNumber;
        return this;
    }

    boolean and(int secondNumber) {
        return numberToCompare >= min(firstNumber, secondNumber) && numberToCompare <= max(firstNumber, secondNumber);
    }

    static JReadable object(Object object) {
        return new JReadable(object);
    }

    boolean isNull() {
        return Objects.isNull(object);
    }

    boolean isNotNull() {
        return !isNull();
    }
}
