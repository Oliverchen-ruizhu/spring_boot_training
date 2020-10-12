package com.oliverchen.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: Spring Boot MVC 基本配置
 * @Date:Create：in 2020/10/11 16:14
 * @Modified By：
 */
// 注意这里已经不是 @RestController 了和上个试验不同，因为需要返回视图，所以不能使用 @ResponseBody
    @org.springframework.stereotype.Controller
public class Controller {
        @RequestMapping("oliver")
    public String oliver(){
            return "oliver";
        }

}
