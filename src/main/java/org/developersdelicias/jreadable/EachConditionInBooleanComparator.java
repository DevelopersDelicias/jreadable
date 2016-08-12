package org.developersdelicias.jreadable;

class EachConditionInBooleanComparator extends BooleanComparator {

    EachConditionInBooleanComparator(boolean[] conditions) {
        super(conditions);
    }

    @Override
    boolean isTrue() {
        return falseWhenOneIs(false);
    }

    @Override
    boolean isFalse() {
        return falseWhenOneIs(true);
    }

}
