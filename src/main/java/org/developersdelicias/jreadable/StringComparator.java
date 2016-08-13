package org.developersdelicias.jreadable;

import static org.apache.commons.lang3.math.NumberUtils.isNumber;

class StringComparator {
    private String string;

    StringComparator(String string) {
        this.string = string;
    }

    boolean isNumeric() {
        return isNumber(string);
    }

    boolean isNotNumeric() {
        return !isNumeric();
    }
}
