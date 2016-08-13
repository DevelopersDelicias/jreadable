package org.developersdelicias.jreadable;


import java.util.Objects;

class ObjectComparator {
    private final Object object;

    ObjectComparator(Object object) {
        this.object = object;
    }

    boolean isNull() {
        return Objects.isNull(object);
    }

    boolean isNotNull() {
        return !isNull();
    }

    boolean isEqualsTo(Object otherObject) {
        return Objects.equals(object, otherObject);
    }

    boolean isNotEqualTo(Object otherObject) {
        return !isEqualsTo(otherObject);
    }
}
