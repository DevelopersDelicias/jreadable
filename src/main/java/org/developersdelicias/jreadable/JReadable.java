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


    private boolean[] conditions = new boolean[0];

    private JReadable(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    private JReadable(Object object) {
        this.object = object;
    }

    private JReadable(boolean... conditions) {
        this.conditions = conditions;
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

    static JReadable eachConditionIn(boolean... conditions) {
        return new JReadable(conditions);
    }

    boolean isTrue() {
        return falseWhenOneIs(false);
    }

    boolean isFalse() {
        return falseWhenOneIs(true);
    }

    private boolean falseWhenOneIs(boolean expectedCondition) {
        for (boolean condition : conditions) {
            if (condition == expectedCondition)
                return false;
        }
        return true;
    }
}
