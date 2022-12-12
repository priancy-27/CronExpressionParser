package com.cron.parser.service;


public interface CronExpressionValidator {

    boolean validateCronExpression(String cronExpression);
}
