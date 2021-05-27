package com.epam.lab.util;


import com.epam.lab.utilling.StringUtils;

import java.util.Arrays;
public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
