package com.happyheng.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * Created by happyheng on 16/11/13.
 */
@Component
public class ValuePeople {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ValuePeople{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
