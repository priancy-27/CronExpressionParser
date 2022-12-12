package com.cron.parser.service.impl;

import com.cron.parser.enumerations.FieldTypeEnum;
import com.cron.parser.service.CronEvaluator;
import org.springframework.stereotype.Service;

@Service
public class DayOfMonthCronEvaluator extends CronEvaluator {

    @Override
    public FieldTypeEnum getField() {
        return FieldTypeEnum.DAY_OF_MONTH;
    }
}
