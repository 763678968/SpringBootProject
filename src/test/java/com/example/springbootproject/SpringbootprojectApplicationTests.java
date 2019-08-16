package com.example.springbootproject;

import com.example.springbootproject.entity.Student;
import com.example.springbootproject.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootprojectApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootprojectApplicationTests.class);

    @Autowired
    Student student;

    @Autowired
    ApplicationContext context; // SpringIOC容器

    @Test
    public void contextLoads() {
        System.out.println(student);
    }

    @Test
    public void testLog() { // 日志级别
        logger.trace("trace********");
        logger.debug("debug********");
        logger.info("info********");
        logger.warn("warn********");
        logger.error("error********");
    }

//    @Test
//    public void test() {
//        StudentService stuService = (StudentService)context.getBean("stuService");
//        System.out.println(stuService + "===============");
//    }

}
