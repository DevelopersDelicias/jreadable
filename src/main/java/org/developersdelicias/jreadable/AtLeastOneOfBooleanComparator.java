package org.developersdelicias.jreadable;


class AtLeastOneOfBooleanComparator {

    private final boolean[] conditions;

    AtLeastOneOfBooleanComparator(boolean[] conditions) {
        this.conditions = conditions;
    }

    boolean isTrue() {
        return trueWhenOneIs(true);
    }

    boolean isFalse() {
        return trueWhenOneIs(false);
    }

    private boolean trueWhenOneIs(boolean expectedCondition) {
        for (boolean condition : conditions) {
            if (condition == expectedCondition)
                return true;
        }
        return false;
    }
}
