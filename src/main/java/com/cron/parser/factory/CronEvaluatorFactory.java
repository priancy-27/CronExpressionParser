package com.cron.parser.factory;

import com.cron.parser.enumerations.FieldTypeEnum;
import com.cron.parser.service.CronEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CronEvaluatorFactory {

    @Autowired
    private List<CronEvaluator> cronEvaluators;

    private static Map<FieldTypeEnum, CronEvaluator> cronEvaluatorMap = new HashMap<>();

    @PostConstruct
    public void init() {
        for(CronEvaluator service : cronEvaluators) {
            cronEvaluatorMap.put(service.getField(), service);
        }
    }

    public static CronEvaluator getEvaluator(FieldTypeEnum fieldType) {
        CronEvaluator service = cronEvaluatorMap.get(fieldType);
        if(service == null){
            throw new RuntimeException("Unknown fieldType: " + fieldType);
        }
        return service;
    }
}
