package com.cron.parser.service;

import com.cron.parser.enumerations.FieldTypeEnum;
import com.cron.parser.exception.InvalidCronFieldValueException;
import com.cron.parser.utils.IntervalParserUtils;
import com.cron.parser.utils.RangeParserUtils;
import com.cron.parser.utils.ValueParserUtils;

public abstract class CronEvaluator {

    public String evaluateCronExpression(String expression){
        try {
            if (expression.startsWith("*")) {
                return IntervalParserUtils.parseInterval(expression, this.getField().min, this.getField().max);
            } else if (expression.contains("-")) {
                return RangeParserUtils.parseRangeOfValues(expression, this.getField().min, this.getField().max);
            }
            return ValueParserUtils.parseFixedValues(expression);
        } catch (Exception e) {
            throw new InvalidCronFieldValueException("Exception occurred for fieldType:" + this.getField().name() + " error: " + e.getMessage());
        }
    }

    public abstract FieldTypeEnum getField();
}
