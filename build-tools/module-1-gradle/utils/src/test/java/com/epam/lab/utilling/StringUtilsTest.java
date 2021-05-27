package com.epam.lab.utilling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest(){
        assertTrue(StringUtils.isPositiveNumber("123"));
        assertFalse(StringUtils.isPositiveNumber("-123"));
        assertFalse(StringUtils.isPositiveNumber("1 23"));
        assertFalse(StringUtils.isPositiveNumber("1d23"));
        assertFalse(StringUtils.isPositiveNumber(null));
        assertTrue(StringUtils.isPositiveNumber("0"));
    }
}
