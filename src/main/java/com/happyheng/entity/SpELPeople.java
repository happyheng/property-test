package com.happyheng.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * Created by happyheng on 16/11/14.
 */
@Component
public class SpELPeople {

    @Value("#{configProperties['name']}")
    private String name;

    @Value("#{18}")
    private int age;

    @Value("#{valuePeople.name}")
    private String valuePeopleName;

    @Value("#{valuePeople.toString()}")
    private String valuePeopleToString;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getValuePeopleName() {
        return valuePeopleName;
    }

    public void setValuePeopleName(String valuePeopleName) {
        this.valuePeopleName = valuePeopleName;
    }

    public String getValuePeopleToString() {
        return valuePeopleToString;
    }

    public void setValuePeopleToString(String valuePeopleToString) {
        this.valuePeopleToString = valuePeopleToString;
    }
}
