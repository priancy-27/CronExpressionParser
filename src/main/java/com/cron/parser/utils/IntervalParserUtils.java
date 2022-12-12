package com.cron.parser.utils;

import com.cron.parser.exception.InvalidCronFieldValueException;

public class IntervalParserUtils {

    public static String parseInterval(String expression, int min, int max) {
        String[] intervalList = expression.split("/");
        String result = "";
        int interval = 1;
        if (intervalList.length > 2) {
            throw new InvalidCronFieldValueException("Invalid intervals");
        }
        if (intervalList.length == 2) {
            interval = Integer.parseInt(intervalList[1]);
        }

        for (int i = min; i <= max; i += interval) {
            result += i + " ";
        }
        return result;
    }
}
