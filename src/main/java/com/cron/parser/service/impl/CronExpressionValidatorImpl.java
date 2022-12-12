package com.cron.parser.service.impl;

import com.cron.parser.exception.InvalidCronExpressionException;
import com.cron.parser.service.CronExpressionValidator;
import org.springframework.stereotype.Service;

@Service
public class CronExpressionValidatorImpl implements CronExpressionValidator {

    @Override
    public boolean validateCronExpression(String cronExpression) {
        if(cronExpression == null || cronExpression.equals("")){
            throw new InvalidCronExpressionException("Cron Expression is null or empty");
        }
        String[] list = cronExpression.split(" ");
        if(list == null || list.length == 0 || list.length != 6){
            throw new InvalidCronExpressionException("Invalid Cron Expression Length");
        }
        return true;
    }
}
