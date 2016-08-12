package org.developersdelicias.jreadable;

abstract class BooleanComparator {
    private final boolean[] conditions;

    BooleanComparator(boolean[] conditions) {
        this.conditions = conditions;
    }

    abstract boolean isTrue();

    abstract boolean isFalse();

    boolean trueWhenOneIs(boolean expectedCondition) {
        return condition(true, expectedCondition, false);
    }

    boolean falseWhenOneIs(boolean expectedCondition) {
        return condition(false, expectedCondition, true);
    }

    private boolean condition(boolean conditionToReturn, boolean expectedCondition, boolean defaultValueWhenNotExpected) {
        for (boolean condition : conditions) {
            if (condition == expectedCondition) {
                return conditionToReturn;
            }
        }
        return defaultValueWhenNotExpected;
    }
}
