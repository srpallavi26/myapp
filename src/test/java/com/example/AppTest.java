package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual, "2 + 3 should equal 5");
    }
}

