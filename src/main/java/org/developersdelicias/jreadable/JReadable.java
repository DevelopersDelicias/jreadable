package org.developersdelicias.jreadable;

class JReadable {

    static NumberComparator valueOf(int numberToCompare) {
        return new NumberComparator(numberToCompare);
    }

    static ObjectComparator object(Object object) {
        return new ObjectComparator(object);
    }

    static StringComparator string(String string) {
        return new StringComparator(string);
    }

    static EachConditionInBooleanComparator eachConditionIn(boolean... conditions) {
        return new EachConditionInBooleanComparator(conditions);
    }

    static AtLeastOneOfBooleanComparator atLeastOneOf(boolean... conditions) {
        return new AtLeastOneOfBooleanComparator(conditions);
    }
}
