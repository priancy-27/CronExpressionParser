package com.cron.parser.service;

import com.cron.parser.enumerations.FieldTypeEnum;

import java.util.HashMap;
import java.util.Map;

public class CronManager {

    private static Map<Integer, FieldTypeEnum> fieldPositionMap = new HashMap<>();

    static {
        fieldPositionMap.put(0, FieldTypeEnum.MINUTES);
        fieldPositionMap.put(1, FieldTypeEnum.HOURS);
        fieldPositionMap.put(2, FieldTypeEnum.DAY_OF_MONTH);
        fieldPositionMap.put(3, FieldTypeEnum.MONTH);
        fieldPositionMap.put(4, FieldTypeEnum.DAY_OF_WEEK);
        fieldPositionMap.put(5, FieldTypeEnum.COMMAND);
    }

    public static FieldTypeEnum getFieldTypeEnum(int position){
        return fieldPositionMap.get(position);
    }

}
