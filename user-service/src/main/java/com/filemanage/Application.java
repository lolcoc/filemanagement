package com.filemanage;

import com.sdk.dubbo.DubboRunner;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.rerloan.configuration.dao")
@ComponentScan({"com.rerloan","com.xboot"})
@ImportResource({"classpath:spring-context.xml"})
@EnableScheduling
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext applicationContext = (AbstractApplicationContext) SpringApplication.run(Application.class, args);
        // start dubbo
        DubboRunner dubboRunner = new DubboRunner(applicationContext, Application.class);
        dubboRunner.start();
    }

}
