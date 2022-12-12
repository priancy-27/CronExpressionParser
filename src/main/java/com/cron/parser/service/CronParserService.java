package com.cron.parser.service;

import java.util.List;

public interface CronParserService {

     List<String> parseCron(String cronExpression);

}
