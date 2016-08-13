package org.developersdelicias.jreadable;

import static java.lang.Math.max;
import static java.lang.Math.min;

class NumberComparator {
    private int firstNumber;
    private int numberToCompare;

    NumberComparator(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    NumberComparator isBetween(int firstNumber) {
        this.firstNumber = firstNumber;
        return this;
    }

    boolean and(int secondNumber) {
        return numberToCompare >= min(firstNumber, secondNumber) && numberToCompare <= max(firstNumber, secondNumber);
    }
}
