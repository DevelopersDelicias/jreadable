package org.developersdelicias.jreadable;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static org.apache.commons.lang3.math.NumberUtils.isNumber;

class JReadable {

    private String string;
    private int numberToCompare;
    private int firstNumber;

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }


    private JReadable(String string) {
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

    static ObjectComparator object(Object object) {
        return new ObjectComparator(object);
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

    static EachConditionInBooleanComparator eachConditionIn(boolean... conditions) {
        return new EachConditionInBooleanComparator(conditions);
    }

    static AtLeastOneOfBooleanComparator atLeastOneOf(boolean... conditions) {
        return new AtLeastOneOfBooleanComparator(conditions);
    }
}
