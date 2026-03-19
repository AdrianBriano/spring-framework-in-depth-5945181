package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = applicationContext.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Frank");
            Thread.sleep(5000);
        }
    }
}