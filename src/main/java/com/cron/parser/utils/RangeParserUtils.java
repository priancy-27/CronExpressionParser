package com.cron.parser.utils;

import com.cron.parser.exception.InvalidCronFieldValueException;

public class RangeParserUtils {

    public static String parseRangeOfValues(String expression, int min, int max) {
        String[] range = expression.split("-");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        String result = "";

        if(range.length != 2){
            throw new InvalidCronFieldValueException("Invalid Range");
        }
        if(end < start){
            throw new InvalidCronFieldValueException("Invalid Range");
        }
        if(start < min || end > max){
            throw new InvalidCronFieldValueException("Invalid Start Or End Value in Range");
        }

        for (int i = start; i <= end; i++) {
            result += i+" ";
        }
        return result;
    }

}
