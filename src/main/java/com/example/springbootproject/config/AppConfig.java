package com.example.springbootproject.config;

import com.example.springbootproject.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 配置类
@Configuration
public class AppConfig {

    @Bean
    public StudentService stuService() { // <bean id="xxxxxx">
        StudentService stuService = new StudentService();

//        StudentDao stuDao = new StudentDao();
//        stuService.setStudentDao(stuDao);

        return stuService; // 返回值<bean class="xxxxxx">
    }
}
