package org.developersdelicias.jreadable;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static org.apache.commons.lang3.math.NumberUtils.isNumber;

class JReadable {

    private String string;
    private Object object;
    private int numberToCompare;
    private int firstNumber;

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    public JReadable(Object object) {
        this.object = object;
    }

    public JReadable(String string) {
        this.string = string;
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

    boolean isEqualsTo(Object otherObject) {
        return Objects.equals(object, otherObject);
    }

    boolean isNotEqualTo(Object otherObject) {
        return !isEqualsTo(otherObject);
    }

    static JReadable string(String string) {
        return new JReadable(string);
    }

    boolean isNumeric() {
        return isNumber(string);
    }

    boolean isNotNumeric() {
        return !isNumeric();
    }
}
