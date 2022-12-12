package com.cron.parser.service.impl;

import com.cron.parser.enumerations.FieldTypeEnum;
import com.cron.parser.service.CronEvaluator;
import com.cron.parser.service.CronExpressionValidator;
import com.cron.parser.service.CronParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.cron.parser.factory.CronEvaluatorFactory.getEvaluator;
import static com.cron.parser.service.CronManager.getFieldTypeEnum;

@Service
public class CronParserServiceImpl implements CronParserService {

    @Autowired
    private CronExpressionValidator cronExpressionValidator;

    @Override
    public List<String> parseCron(String cronExpression) {

        boolean isValid = cronExpressionValidator.validateCronExpression(cronExpression);
        if(!isValid){
            return null;
        }
        String[] expressionsList = cronExpression.split(" ");
        List<String> result = new ArrayList<>();

        for(int i = 0 ; i < expressionsList.length ; i++){
            FieldTypeEnum field = getFieldTypeEnum(i);
            CronEvaluator cronEvaluator = getEvaluator(field);
            String output = cronEvaluator.evaluateCronExpression(expressionsList[i]);
            result.add(field.name()+" "+output);
            System.out.println(field.name()+" "+output);
        }
        return result;
    }
}
