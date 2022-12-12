package com.cron.parser;

import com.cron.parser.service.CronParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CronExpressionParserApplication implements ApplicationRunner {

    @Autowired
    CronParserService parser;


    public static void main(String[] args) {
        SpringApplication.run(CronExpressionParserApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        for(String arg : args.getSourceArgs()){
            try{
                parser.parseCron(arg);
            } catch(Exception e){
                System.out.println("Exception occured for arg:"+arg+" error: "+e);
            }
            System.out.println();
        }
    }
}
