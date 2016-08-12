package org.developersdelicias.jreadable;

class AtLeastOneOfBooleanComparator extends BooleanComparator {

    AtLeastOneOfBooleanComparator(boolean[] conditions) {
        super(conditions);
    }

    @Override
    boolean isTrue() {
        return condition(true).whenOneIs(true);
    }

    @Override
    boolean isFalse() {
        return condition(true).whenOneIs(false);
    }

}
