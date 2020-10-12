package com.oliverchen.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: start test
 * @Date:Create：in 2020/10/11 14:59
 * @Modified By：
 */
@RestController
@EnableAutoConfiguration
//加载classes目录下的oliver.properties文件（访问其他配置文件中的属性）
//@PropertySource(value = "classes:oliver.properties")
//注意idea下不需用书写那个目录（我猜的）
@PropertySource(value = "oliver.properties")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    //使用Value注解注入属性值
    @Value("${oliver.springboot}")//其他自定义的配置文件中的属性是访问不到的，还需要其他的处理。
    private String hello;

    @Value("${oliver.test}")
    private String test;

    @RequestMapping(value = "/hello")
    public String hello(){
        return test;
    }

}
