package org.developersdelicias.jreadable;

abstract class BooleanComparator {
    private final boolean[] conditions;
    private boolean conditionToReturn;

    BooleanComparator(boolean[] conditions) {
        this.conditions = conditions;
    }

    abstract boolean isTrue();

    abstract boolean isFalse();

    boolean whenOneIs(boolean expectedCondition) {
        for (boolean condition : conditions) {
            if (condition == expectedCondition) {
                return conditionToReturn;
            }
        }
        return !conditionToReturn;
    }

    BooleanComparator condition(boolean conditionToReturn) {
        this.conditionToReturn = conditionToReturn;
        return this;
    }

}
