package org.developersdelicias.jreadable;

class EachConditionInBooleanComparator extends BooleanComparator {

    EachConditionInBooleanComparator(boolean[] conditions) {
        super(conditions);
    }

    @Override
    boolean isTrue() {
        return condition(false).whenOneIs(false);
    }

    @Override
    boolean isFalse() {
        return condition(false).whenOneIs(true);
    }

}
