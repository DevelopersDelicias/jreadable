package org.developersdelicias.jreadable;

import org.junit.jupiter.api.Test;

import static org.developersdelicias.jreadable.JReadable.valueOf;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JReadableTest {

    @Test
    void inform_when_a_number_is_between_two_numbers() {
        assertTrue(valueOf(8).isBetween(5).and(10), "Should return true because 8 is between 5 and 10");
    }

    @Test
    public void inform_when_a_number_is_not_between_two_numbers() {
        assertFalse(valueOf(2).isBetween(5).and(10), "Should return false because 2 is not between 5 and 10");

    }
}
