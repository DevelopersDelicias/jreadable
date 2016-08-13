package org.developersdelicias.jreadable;

import static org.apache.commons.lang3.math.NumberUtils.isNumber;

class JReadable {

    private String string;

    private JReadable(String string) {
        this.string = string;
    }

    static NumberComparator valueOf(int numberToCompare) {
        return new NumberComparator(numberToCompare);
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
