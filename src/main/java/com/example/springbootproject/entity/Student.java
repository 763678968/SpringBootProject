package com.example.springbootproject.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component // 将此Javabean放入Spring容器
@ConfigurationProperties(prefix = "student")
//@Validated // 开启JSR303数据校验的注解
//@PropertySource(value={"classpath:application.properties"})
public class Student {
//    @Value("gawefwe")
//    @Email
    private String email;
    private String name;
//    @Value("${student.uname}")
    private String userName;
//    @Value("33")
    private int age;
    private boolean sex; // true:男 false:女
    private Date birthday;
    // {province:陕西，city:西安，zone:莲湖区}
//    @Value("{province:陕西，city:西安，zone:莲湖区}")
    private Map<String, Object> location;
    private String[] hobbies;
    private List<String> skills;
    private Pet pet;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", location=" + location +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", skills=" + skills +
                ", pet=" + pet +
                '}';
    }
}
