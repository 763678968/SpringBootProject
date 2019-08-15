package com.example.springbootproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("helloWorld")
    public String helloWorld() {
        return "hello world; hello spring boot";
    }
    // 传统写法：com.example.Controller手工写到scan扫描器中（即加入Spring容器）
    // SpringBoot自动配置：com.example.springbootproject.xxx及com.example.springbootproject纳入Spring容器
}
