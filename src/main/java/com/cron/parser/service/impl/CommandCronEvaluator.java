package com.cron.parser.service.impl;

import com.cron.parser.enumerations.FieldTypeEnum;
import com.cron.parser.service.CronEvaluator;
import org.springframework.stereotype.Service;

@Service
public class CommandCronEvaluator extends CronEvaluator {

    @Override
    public String evaluateCronExpression(String expression) {
        return expression;
    }

    @Override
    public FieldTypeEnum getField() {
        return FieldTypeEnum.COMMAND;
    }
}
