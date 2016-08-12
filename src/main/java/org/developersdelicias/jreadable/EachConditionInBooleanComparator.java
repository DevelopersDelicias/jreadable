package org.developersdelicias.jreadable;

class EachConditionInBooleanComparator {
    private boolean[] conditions;

    EachConditionInBooleanComparator(boolean[] conditions) {
        this.conditions = conditions;
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
