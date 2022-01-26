package com.kjdevelopmentdotwest.stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        assertTrue(new StringUtils().isPositiveNumber("12"));
    }
}