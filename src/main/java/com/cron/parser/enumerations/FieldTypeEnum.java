package com.cron.parser.enumerations;

public enum FieldTypeEnum {
    MINUTES(0, 59),
    HOURS(0, 23),
    DAY_OF_MONTH(1, 31),
    MONTH(1, 12),
    DAY_OF_WEEK(1, 7),
    COMMAND(0, 0);

    public int min;
    public int max;

    FieldTypeEnum(int min, int max) {
        this.min = min;
        this.max = max;
    }

}
