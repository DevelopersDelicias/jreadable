package org.developersdelicias.jreadable;

class AtLeastOneOfBooleanComparator extends BooleanComparator {

    AtLeastOneOfBooleanComparator(boolean[] conditions) {
        super(conditions);
    }

    @Override
    boolean isTrue() {
        return trueWhenOneIs(true);
    }

    @Override
    boolean isFalse() {
        return trueWhenOneIs(false);
    }

}
