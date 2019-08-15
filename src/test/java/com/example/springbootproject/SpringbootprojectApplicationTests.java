package com.example.springbootproject;

import com.example.springbootproject.entity.Student;
import com.example.springbootproject.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootprojectApplicationTests {

    @Autowired
    Student student;

    @Autowired
    ApplicationContext context; // SpringIOC容器

    @Test
    public void contextLoads() {
        System.out.println(student);
    }

//    @Test
//    public void test() {
//        StudentService stuService = (StudentService)context.getBean("stuService");
//        System.out.println(stuService + "===============");
//    }

}
