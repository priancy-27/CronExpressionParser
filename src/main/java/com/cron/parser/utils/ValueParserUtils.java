package com.cron.parser.utils;

import com.cron.parser.exception.InvalidCronFieldValueException;

public class ValueParserUtils {

    public static String parseFixedValues(String expression) {
        String[] valueList = expression.split(",");
        if(valueList.length <= 1){
            return expression;
        }
        String result = "";

        if(valueList.length <= 1){
            throw new InvalidCronFieldValueException("Invalid fixed values");
        }

        for (String value : valueList) {
            result += value +" ";
        }
        return result;
    }

}
